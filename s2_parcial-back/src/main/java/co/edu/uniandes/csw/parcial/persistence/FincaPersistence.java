/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.parcial.persistence;

import co.edu.uniandes.csw.parcial.entities.FincaEntity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * author Santiago Triana 201923265
 */
public class FincaPersistence {
    
    @PersistenceContext (unitName = "parcialPU")
    protected EntityManager em;
    
     public FincaEntity create (FincaEntity pFincaEntity){
        em.persist(pFincaEntity);
        return pFincaEntity;
    }
    
}
