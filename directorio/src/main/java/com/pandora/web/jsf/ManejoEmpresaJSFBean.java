/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pandora.web.jsf;

import com.pandora.dat.AdmEmpresaSFBean;
import com.pandora.modelo.DtEmpresa;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author fercris
 */
@SessionScoped
@Named
public class ManejoEmpresaJSFBean implements Serializable{

    AdmEmpresaSFBean admEmpresaSFBean ;

    private AdmEmpresaSFBean lookupAdmEmpresaSFBeanBean() {
        try {
            Context c = new InitialContext();
            return (AdmEmpresaSFBean) c.lookup("java:global/ProyectoJAOREE-ear/ProyectoJAOREE-ejb-1.0/AdmEmpresaSFBean!com.pandora.dat.AdmEmpresaSFBean");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }
    
    public void grabarEmpresa_AE(){
        admEmpresaSFBean= lookupAdmEmpresaSFBeanBean();
        admEmpresaSFBean.guardarEmpresa(empresa);
        admEmpresaSFBean.remover();
               
    }
    
    private DtEmpresa empresa = new DtEmpresa();

    /**
     * @return the empresa
     */
    public DtEmpresa getEmpresa() {
        return empresa;
    }

    /**
     * @param empresa the empresa to set
     */
    public void setEmpresa(DtEmpresa empresa) {
        this.empresa = empresa;
    }
    
    
            
    
    
    
    
    
    
}
