/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pandora.dat;

import com.pandora.modelo.DtEmpresa;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Remove;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author fercris
 */
@Stateful
@LocalBean
public class AdmEmpresaSFBean {

    @PersistenceContext(unitName = "PryPU")
    EntityManager em;

    /**
     * Grabar o Actualizar una empresa
     *
     * @param pDtEmpresa objeto empresa
     */
    public void guardarEmpresa(DtEmpresa pDtEmpresa) {
        pDtEmpresa = em.merge(pDtEmpresa);
    }

    public List<DtEmpresa> obtenerEmpresa() {
        return em.createNamedQuery("DtEmpresa.findAll").getResultList();

    }
    
    @Remove
    public void remover(){
        
    }

}
