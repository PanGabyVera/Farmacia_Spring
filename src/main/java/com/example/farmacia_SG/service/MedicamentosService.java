package com.example.farmacia_SG.service;


import com.example.farmacia_SG.model.Pedidomedicamentos;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author Default
 */
public interface MedicamentosService {

    public Pedidomedicamentos crear(Pedidomedicamentos m);

    public Pedidomedicamentos findById(Long id);

    public List<Pedidomedicamentos> findByAll();

    public void delete(Long id);  
}
