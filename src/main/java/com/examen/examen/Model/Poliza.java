package com.examen.examen.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;

/**
 *
 * @author angel
 */
@Entity
@Table(name = "Polizas")
public class Poliza {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (unique = true)
    private Integer idPoliza;
    private String empleadoGenero;   
    private String sku;   
    private Integer cantidad;    
    private Date fecha;

    public Integer getIdPoliza() {
        return idPoliza;
    }

    public void setIdPoliza(Integer idPoliza) {
        this.idPoliza = idPoliza;
    }

    public String getEmpleadoGenero() {
        return empleadoGenero;
    }

    public void setEmpleadoGenero(String empleadoGenero) {
        this.empleadoGenero = empleadoGenero;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }


}
