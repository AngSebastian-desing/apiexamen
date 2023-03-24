package com.examen.examen.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author angel
 */
@Entity
@Table(name = "Empleados")
public class Empleado {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (unique = true)
    private Integer idEmpleado;
    private String nombre;   
    private String apellido;   
    private Integer puesto;

    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getPuesto() {
        return puesto;
    }

    public void setPuesto(Integer puesto) {
        this.puesto = puesto;
    }


}
