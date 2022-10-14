/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.farmacia_SG.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Pandora
 */
@Entity
@Table(name = "pedidomedicamentos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pedidomedicamentos.findAll", query = "SELECT p FROM Pedidomedicamentos p"),
    @NamedQuery(name = "Pedidomedicamentos.findById", query = "SELECT p FROM Pedidomedicamentos p WHERE p.id = :id"),
    @NamedQuery(name = "Pedidomedicamentos.findByNombre", query = "SELECT p FROM Pedidomedicamentos p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "Pedidomedicamentos.findByTipo", query = "SELECT p FROM Pedidomedicamentos p WHERE p.tipo = :tipo"),
    @NamedQuery(name = "Pedidomedicamentos.findByCantidad", query = "SELECT p FROM Pedidomedicamentos p WHERE p.cantidad = :cantidad"),
    @NamedQuery(name = "Pedidomedicamentos.findByDistribuidor", query = "SELECT p FROM Pedidomedicamentos p WHERE p.distribuidor = :distribuidor"),
    @NamedQuery(name = "Pedidomedicamentos.findBySucursal", query = "SELECT p FROM Pedidomedicamentos p WHERE p.sucursal = :sucursal"),
    @NamedQuery(name = "Pedidomedicamentos.findByResultado", query = "SELECT p FROM Pedidomedicamentos p WHERE p.resultado = :resultado")})
public class Pedidomedicamentos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "tipo")
    private String tipo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cantidad")
    private int cantidad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "distribuidor")
    private String distribuidor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "sucursal")
    private String sucursal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "resultado")
    private String resultado;

    public Pedidomedicamentos() {
    }

    public Pedidomedicamentos(Long id) {
        this.id = id;
    }

    public Pedidomedicamentos(Long id, String nombre, String tipo, int cantidad, String distribuidor, String sucursal, String resultado) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.distribuidor = distribuidor;
        this.sucursal = sucursal;
        this.resultado = resultado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDistribuidor() {
        return distribuidor;
    }

    public void setDistribuidor(String distribuidor) {
        this.distribuidor = distribuidor;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pedidomedicamentos)) {
            return false;
        }
        Pedidomedicamentos other = (Pedidomedicamentos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.example.farmacia_SG.model.Pedidomedicamentos[ id=" + id + " ]";
    }
    
}
