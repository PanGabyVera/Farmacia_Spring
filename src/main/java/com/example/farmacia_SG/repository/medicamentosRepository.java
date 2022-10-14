/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.farmacia_SG.repository;

import com.example.farmacia_SG.model.Pedidomedicamentos;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Default
 */
public interface medicamentosRepository extends JpaRepository<Pedidomedicamentos,Long>{
    
}
