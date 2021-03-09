/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.parcial.test.logic;

import co.edu.uniandes.csw.parcial.ejb.FincaLogic;
import co.edu.uniandes.csw.parcial.entities.FincaEntity;
import co.edu.uniandes.csw.parcial.exceptions.BusinessLogicException;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.junit.Assert;
import org.junit.Test;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

/**
 *
 * @author estudiante
 */
public class FincaLogicTest {
    
    private PodamFactory factory = new PodamFactoryImpl();

    @Inject
    private FincaLogic fincaLogic;
    
    @PersistenceContext
    private EntityManager em;
    
    @Test
    public void createFincaTest() throws BusinessLogicException {
        FincaEntity newEntity = factory.manufacturePojo(FincaEntity.class);
        FincaEntity result = fincaLogic.createFinca(newEntity);
        Assert.assertNotNull(result);
        FincaEntity entity = em.find(FincaEntity.class, result.getId());
        Assert.assertEquals(newEntity.getNombre(), entity.getNombre());
    }
    
}
