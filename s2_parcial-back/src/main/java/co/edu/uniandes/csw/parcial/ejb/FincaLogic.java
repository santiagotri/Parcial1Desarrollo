/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.parcial.ejb;

import co.edu.uniandes.csw.parcial.entities.FincaEntity;
import co.edu.uniandes.csw.parcial.exceptions.BusinessLogicException;
import co.edu.uniandes.csw.parcial.persistence.FincaPersistence;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author estudiante
 */
@Stateless
public class FincaLogic {
    
    @Inject
    private FincaPersistence fincaPersistence;
    
     public FincaEntity createFinca (FincaEntity finca ) throws BusinessLogicException{
        
        if(finca.getNumeroHabitaciones()>0)throw new BusinessLogicException("La finca debe tener mas de 0 habitaciones");
        if(finca.getNombre().length()<4)throw new BusinessLogicException("El nombre debe contener más de tres caracteres.");
        
        finca = fincaPersistence.create(finca);
        return finca;
    }
    
}
