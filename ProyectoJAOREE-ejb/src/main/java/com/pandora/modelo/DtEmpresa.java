/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pandora.modelo;

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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author fercris
 */
@Entity
@Table(name = "dt_empresa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DtEmpresa.findAll", query = "SELECT d FROM DtEmpresa d"),
    @NamedQuery(name = "DtEmpresa.findByEmpId", query = "SELECT d FROM DtEmpresa d WHERE d.empId = :empId"),
    @NamedQuery(name = "DtEmpresa.findByEmpNombre1", query = "SELECT d FROM DtEmpresa d WHERE d.empNombre1 = :empNombre1"),
    @NamedQuery(name = "DtEmpresa.findByEmpNombre2", query = "SELECT d FROM DtEmpresa d WHERE d.empNombre2 = :empNombre2"),
    @NamedQuery(name = "DtEmpresa.findByEmpApellido1", query = "SELECT d FROM DtEmpresa d WHERE d.empApellido1 = :empApellido1"),
    @NamedQuery(name = "DtEmpresa.findByEmpApellido2", query = "SELECT d FROM DtEmpresa d WHERE d.empApellido2 = :empApellido2"),
    @NamedQuery(name = "DtEmpresa.findByEmpRazonSocial", query = "SELECT d FROM DtEmpresa d WHERE d.empRazonSocial = :empRazonSocial"),
    @NamedQuery(name = "DtEmpresa.findByEmpTdoc", query = "SELECT d FROM DtEmpresa d WHERE d.empTdoc = :empTdoc"),
    @NamedQuery(name = "DtEmpresa.findByEmpNumdoc", query = "SELECT d FROM DtEmpresa d WHERE d.empNumdoc = :empNumdoc")})

public class DtEmpresa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "emp_id")
    private Long empId;
    @Size(max = 50)
    @Column(name = "emp_nombre1")
    private String empNombre1;
    @Size(max = 50)
    @Column(name = "emp_nombre2")
    private String empNombre2;
    @Size(max = 50)
    @Column(name = "emp_apellido1")
    private String empApellido1;
    @Size(max = 50)
    @Column(name = "emp_apellido2")
    private String empApellido2;
    @Size(max = 100)
    @Column(name = "emp_razon_social")
    private String empRazonSocial;
    @Size(max = 5)
    @Column(name = "emp_tdoc")
    private String empTdoc;
    @Size(max = 50)
    @Column(name = "emp_numdoc")
    private String empNumdoc;

    public DtEmpresa() {
    }

    public DtEmpresa(Long empId) {
        this.empId = empId;
    }

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public String getEmpNombre1() {
        return empNombre1;
    }

    public void setEmpNombre1(String empNombre1) {
        this.empNombre1 = empNombre1;
    }

    public String getEmpNombre2() {
        return empNombre2;
    }

    public void setEmpNombre2(String empNombre2) {
        this.empNombre2 = empNombre2;
    }

    public String getEmpApellido1() {
        return empApellido1;
    }

    public void setEmpApellido1(String empApellido1) {
        this.empApellido1 = empApellido1;
    }

    public String getEmpApellido2() {
        return empApellido2;
    }

    public void setEmpApellido2(String empApellido2) {
        this.empApellido2 = empApellido2;
    }

    public String getEmpRazonSocial() {
        return empRazonSocial;
    }

    public void setEmpRazonSocial(String empRazonSocial) {
        this.empRazonSocial = empRazonSocial;
    }

    public String getEmpTdoc() {
        return empTdoc;
    }

    public void setEmpTdoc(String empTdoc) {
        this.empTdoc = empTdoc;
    }

    public String getEmpNumdoc() {
        return empNumdoc;
    }

    public void setEmpNumdoc(String empNumdoc) {
        this.empNumdoc = empNumdoc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (empId != null ? empId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DtEmpresa)) {
            return false;
        }
        DtEmpresa other = (DtEmpresa) object;
        if ((this.empId == null && other.empId != null) || (this.empId != null && !this.empId.equals(other.empId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pandora.modelo.DtEmpresa[ empId=" + empId + " ]";
    }
    
}
