/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.parcial.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import uk.co.jemos.podam.common.PodamExclude;
import uk.co.jemos.podam.common.PodamIntValue;
import uk.co.jemos.podam.common.PodamStringValue;

/**
 *
 * @author Santiago Triana 201923265
 */
@Entity
public class FincaEntity extends BaseEntity implements Serializable {
    
    
    private String nombre;
    
    @PodamIntValue(minValue = 0)
    private Integer extension;
    
    @PodamIntValue(minValue = -80, maxValue = 60)
    private Integer climaPromedio;
    
    @PodamIntValue(minValue = 0)
    private Integer numeroHabitaciones;
    
    @PodamIntValue(minValue = 0, maxValue = 5)
    private Integer calificacion;

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the extension
     */
    public Integer getExtension() {
        return extension;
    }

    /**
     * @return the climaPromedio
     */
    public Integer getClimaPromedio() {
        return climaPromedio;
    }

    /**
     * @return the numeroHabitaciones
     */
    public Integer getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    /**
     * @return the calificacion
     */
    public Integer getCalificacion() {
        return calificacion;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @param extension the extension to set
     */
    public void setExtension(Integer extension) {
        this.extension = extension;
    }

    /**
     * @param climaPromedio the climaPromedio to set
     */
    public void setClimaPromedio(Integer climaPromedio) {
        this.climaPromedio = climaPromedio;
    }

    /**
     * @param numeroHabitaciones the numeroHabitaciones to set
     */
    public void setNumeroHabitaciones(Integer numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }

    /**
     * @param calificacion the calificacion to set
     */
    public void setCalificacion(Integer calificacion) {
        this.calificacion = calificacion;
    }

    
}
