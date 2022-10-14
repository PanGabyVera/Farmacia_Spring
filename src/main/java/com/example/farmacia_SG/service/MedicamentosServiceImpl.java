/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.farmacia_SG.service;

import com.example.farmacia_SG.model.Pedidomedicamentos;
import com.example.farmacia_SG.repository.medicamentosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Default
 */
@Service
public class MedicamentosServiceImpl implements MedicamentosService{

    @Autowired
    private medicamentosRepository medicamentosrepository;
    
    @Override
    public Pedidomedicamentos crear(Pedidomedicamentos m) {
        return medicamentosrepository.save(m);
    }

    @Override
    public Pedidomedicamentos findById(Long id) {
        return medicamentosrepository.findById(id).orElse(null);
    }

    @Override
    public List<Pedidomedicamentos> findByAll() {
        return medicamentosrepository.findAll();
    }

    @Override
    public void delete(Long id) {
        medicamentosrepository.deleteById(id);
    }
    
}
