/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.parcial.resources;

import co.edu.uniandes.csw.parcial.dtos.FincaDTO;
import co.edu.uniandes.csw.parcial.ejb.FincaLogic;
import co.edu.uniandes.csw.parcial.exceptions.BusinessLogicException;
import java.util.logging.Level;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author josejbocanegra
 */
@Path("/fincas")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@RequestScoped
public class FincaResource {
    
    @Inject
    private FincaLogic fincaLogic;
    
    public FincaDTO createFinca (FincaDTO finca){
        return finca;
    }
    
    @POST
    public FincaDTO createFinca(@PathParam("fincaId") Long groomersId, FincaDTO finca) throws BusinessLogicException {
        FincaDTO nuevoFincaDTO = new FincaDTO(fincaLogic.createFinca(finca.toEntity()));
        return nuevoFincaDTO;
    }
    
}
