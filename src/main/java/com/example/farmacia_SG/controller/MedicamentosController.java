/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.farmacia_SG.controller;

import com.example.farmacia_SG.model.Pedidomedicamentos;
import com.example.farmacia_SG.service.MedicamentosService;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;
import org.apache.catalina.DistributedManager;
import org.hibernate.mapping.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Default
 */
@RestController
@RequestMapping("/api/medicamentos")
public class MedicamentosController {

    @Autowired
    MedicamentosService medicamentosservice;

    @GetMapping("/lista")
    public ResponseEntity<List<Pedidomedicamentos>> listar() {
        return new ResponseEntity<>(medicamentosservice.findByAll(), HttpStatus.OK);
    }

    @PostMapping("/crear")
    public ResponseEntity<String> crear(@RequestBody Pedidomedicamentos m) {

        String res = "";
        String sucursal = "";
 if (m.getCantidad() > 0) {

        if (m.getDistribuidor().isEmpty()== false) {
            switch (m.getDistribuidor().toUpperCase()) {

                case "COFARMA":
                    m.setDistribuidor("COFARMA");
                    res = "correcto";
                    break;
                case "COFARM":
                    m.setDistribuidor("COFARMA");
                    res = "correcto";
                    break;
                case "COFAMA":
                    m.setDistribuidor("COFARMA");
                    res = "correcto";
                    break;
                case "COF":
                    m.setDistribuidor("COFARMA");
                    res = "correcto";
                    break;

                case "EMPSEPHAR":
                    m.setDistribuidor("EMPSEPHAR");
                    res = "correcto";
                    break;
                case "EMPSEPAR":
                    m.setDistribuidor("EMPSEPHAR");
                    res = "correcto";
                    break;
                case "EMPSEP":
                    m.setDistribuidor("EMPSEPHAR");
                    res = "correcto";
                    break;
                case "EMP":
                    m.setDistribuidor("EMPSEPHAR");
                    res = "correcto";
                    break;

                case "CEMEFAR":
                    m.setDistribuidor("CEMEFAR");
                    res = "correcto";
                    break;
                case "CEMEFA":
                    m.setDistribuidor("CEMEFAR");
                    res = "correcto";
                    break;
                case "CEMFAR":
                    m.setDistribuidor("CEMEFAR");
                    res = "correcto";
                    break;
                case "CEM":
                    m.setDistribuidor("CEMEFAR");
                    res = "correcto";
                    break;
            }

            if (m.getSucursal().isEmpty() == false) {
                switch (m.getSucursal().toUpperCase()) {
                    case "PRINCIPAL":
                        m.setSucursal("PRINCIPAL");
                        res = "correcto";
                        sucursal = "Octavio Chacón Moscoso";
                        break;
                    case "PRIL":
                        m.setSucursal("PRINCIPAL");
                        res = "correcto";
                        sucursal = "Octavio Chacón Moscoso";
                        break;
                    case "P":
                        m.setSucursal("PRINCIPAL");
                        res = "correcto";
                        sucursal = "Octavio Chacón Moscoso";
                        break;
                    case "PRINCIPA":
                        m.setSucursal("PRINCIPAL");
                        res = "correcto";
                        sucursal = "Octavio Chacón Moscoso";
                        break;

                    case "SECUNDARIA":
                        m.setSucursal("SECUNDARIA");
                        res = "correcto";
                        sucursal = "AV de la Independencia";
                        break;
                    case "SECUNDARIO":
                        m.setSucursal("SECUNDARIA");
                        res = "correcto";
                        sucursal = "AV de la Independencia";
                        break;
                    case "SEC":
                        m.setSucursal("SECUNDARIA");
                        res = "correcto";
                        sucursal = "AV de la Independencia";
                        break;
                    case "S":
                        m.setSucursal("SECUNDARIA");
                        res = "correcto";
                        sucursal = "AV de la Independencia";
                        break;
                    case "SECUNDA":
                        m.setSucursal("SECUNDARIA");
                        res = "correcto";
                        sucursal = "AV de la Independencia";
                        break;
                }

                    } else {
                        res = "error";
return new ResponseEntity<>("No existe tal sucursal", HttpStatus.BAD_REQUEST);
                    }

                } else {
                    res = "error";
return new ResponseEntity<>("No existe tal distribuidor", HttpStatus.BAD_REQUEST);

                }
        }else {
                    res = "error";
return new ResponseEntity<>("Deben ser numeros mayor a 0", HttpStatus.BAD_REQUEST);}


        m.setResultado("(Distribuidor: " + m.getDistribuidor() + ") " + +m.getCantidad() + " unidades de " + m.getTipo() + ": " + m.getNombre()
                + ". Para la Farmacia SITUADA en " + sucursal
                + " - PEDIDO ENVIADO CORRECTAMENTE -");
        //verificamos
                if (res == "correcto") {
                    return new ResponseEntity<>("Valor Creado correctamente"+medicamentosservice.crear(m), HttpStatus.CREATED);
                } else {

                    return new ResponseEntity<>("Error en el llenado de los datos", HttpStatus.BAD_REQUEST);

                }

    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Pedidomedicamentos> eliminar(@PathVariable Long id) {
        medicamentosservice.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<Pedidomedicamentos> buscar(@PathVariable Long id) {
        return new ResponseEntity<>(buscarUsuario(id), HttpStatus.OK);
    }

    public Pedidomedicamentos buscarUsuario(Long id) {
        return medicamentosservice.findById(id);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<String> actualizar(@PathVariable Long id, @RequestBody Pedidomedicamentos m) {
        Pedidomedicamentos medicamentos = buscarUsuario(id);
       
                medicamentos.setNombre(m.getNombre());
                medicamentos.setTipo(m.getTipo());
                medicamentos.setCantidad(m.getCantidad());
                medicamentos.setDistribuidor(m.getDistribuidor());
                medicamentos.setSucursal(m.getSucursal());

                String res = "";
                String sucursal = "";

        if (m.getCantidad() > 0) {
            

                if (m.getDistribuidor().isEmpty()== false) {
                    switch (m.getDistribuidor().toUpperCase()) {

                        case "COFARMA":
                            m.setDistribuidor("COFARMA");
                            res = "correcto";
                            break;
                        case "COFARM":
                            m.setDistribuidor("COFARMA");
                            res = "correcto";
                            break;
                        case "COFAMA":
                            m.setDistribuidor("COFARMA");
                            res = "correcto";
                            break;
                        case "COF":
                            m.setDistribuidor("COFARMA");
                            res = "correcto";
                            break;

                        case "EMPSEPHAR":
                            m.setDistribuidor("EMPSEPHAR");
                            res = "correcto";
                            break;
                        case "EMPSEPAR":
                            m.setDistribuidor("EMPSEPHAR");
                            res = "correcto";
                            break;
                        case "EMPSEP":
                            m.setDistribuidor("EMPSEPHAR");
                            res = "correcto";
                            break;
                        case "EMP":
                            m.setDistribuidor("EMPSEPHAR");
                            res = "correcto";
                            break;

                        case "CEMEFAR":
                            m.setDistribuidor("CEMEFAR");
                            res = "correcto";
                            break;
                        case "CEMEFA":
                            m.setDistribuidor("CEMEFAR");
                            res = "correcto";
                            break;
                        case "CEMFAR":
                            m.setDistribuidor("CEMEFAR");
                            res = "correcto";
                            break;
                        case "CEM":
                            m.setDistribuidor("CEMEFAR");
                            res = "correcto";
                            break;
                    }

                    if (m.getSucursal().isEmpty()== false) {
                        switch (m.getSucursal().toUpperCase()) {
                            case "PRINCIPAL":
                                m.setSucursal("PRINCIPAL");
                                res = "correcto";
                                sucursal = "Octavio Chacón Moscoso";
                                break;
                            case "PRIL":
                                m.setSucursal("PRINCIPAL");
                                res = "correcto";
                                sucursal = "Octavio Chacón Moscoso";
                                break;
                            case "P":
                                m.setSucursal("PRINCIPAL");
                                res = "correcto";
                                sucursal = "Octavio Chacón Moscoso";
                                break;
                            case "PRINCIPA":
                                m.setSucursal("PRINCIPAL");
                                res = "correcto";
                                sucursal = "Octavio Chacón Moscoso";
                                break;

                            case "SECUNDARIA":
                                m.setSucursal("SECUNDARIA");
                                res = "correcto";
                                sucursal = "AV de la Independencia";
                                break;
                            case "SECUNDARIO":
                                m.setSucursal("SECUNDARIA");
                                res = "correcto";
                                sucursal = "AV de la Independencia";
                                break;
                            case "SEC":
                                m.setSucursal("SECUNDARIA");
                                res = "correcto";
                                sucursal = "AV de la Independencia";
                                break;
                            case "S":
                                m.setSucursal("SECUNDARIA");
                                res = "correcto";
                                sucursal = "AV de la Independencia";
                                break;
                            case "SECUNDA":
                                m.setSucursal("SECUNDARIA");
                                res = "correcto";
                                sucursal = "AV de la Independencia";
                                break;
                        }

                    } else {
                        res = "error";
return new ResponseEntity<>("No existe tal sucursal", HttpStatus.BAD_REQUEST);
                    }

                } else {
                    res = "error";
return new ResponseEntity<>("No existe tal distribuidor", HttpStatus.BAD_REQUEST);

                }
        }else {
                    res = "error";
return new ResponseEntity<>("Deben ser numeros mayor a 0", HttpStatus.BAD_REQUEST);

                }

                m.setResultado("(Distribuidor: " + m.getDistribuidor() + ") " + +m.getCantidad() + " unidades de " + m.getTipo() + ": " + m.getNombre()
                        + ". Para la Farmacia SITUADA en " + sucursal
                        + " - PEDIDO ENVIADO CORRECTAMENTE -");
                //verificamos
                if (res == "correcto") {
                    return new ResponseEntity<>("Valor Actualizado correctamente "+medicamentosservice.crear(m), HttpStatus.OK);
                } else {

                    return new ResponseEntity<>("Error en el llenado de datos", HttpStatus.BAD_REQUEST);

                }
        }

    
}
