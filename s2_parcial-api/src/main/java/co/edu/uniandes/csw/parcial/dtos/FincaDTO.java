/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.parcial.dtos;

import co.edu.uniandes.csw.parcial.entities.FincaEntity;
import java.io.Serializable;
import uk.co.jemos.podam.common.PodamIntValue;

/**
 *
 * @author josejbocanegra
 */
public class FincaDTO implements Serializable {

    
    private Long id;

    private String nombre;
    
    @PodamIntValue(minValue = 0)
    private Integer extension;
    
    @PodamIntValue(minValue = -80, maxValue = 60)
    private Integer climaPromedio;
    
    @PodamIntValue(minValue = 0)
    private Integer numeroHabitaciones;
    
    @PodamIntValue(minValue = 0, maxValue = 5)
    private Integer calificacion;
    
    
    
    public FincaDTO (){}

     public FincaEntity toEntity (){
        FincaEntity rta = new FincaEntity();
        rta.setId(this.getId());
        rta.setNombre(this.nombre);
        rta.setExtension(this.extension);
        rta.setClimaPromedio(this.climaPromedio);
        rta.setNumeroHabitaciones(this.numeroHabitaciones);
        rta.setCalificacion(this.calificacion);
        return rta;
    }
     
     public FincaDTO (FincaEntity fincaEntity){
        if(fincaEntity!=null){
            this.id = fincaEntity.getId();
            this.nombre = fincaEntity.getNombre();
            this.extension = fincaEntity.getExtension();
            this.climaPromedio = fincaEntity.getClimaPromedio();
            this.numeroHabitaciones = fincaEntity.getNumeroHabitaciones();
            this.calificacion = fincaEntity.getCalificacion();
        }
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

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
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
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
