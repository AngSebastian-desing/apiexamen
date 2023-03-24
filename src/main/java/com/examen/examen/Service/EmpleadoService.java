package com.examen.examen.Service;

import com.examen.examen.Model.Empleado;
import com.examen.examen.Repositoy.EmpleadoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author angel
 */
@Service
public class EmpleadoService{
    
    @Autowired
    private EmpleadoRepository empleadoRepository;
    
    public Empleado grabar(Empleado empleado){
        return empleadoRepository.save(empleado);
    } 
    
    public Empleado actualizar(Empleado empleado){
         return empleadoRepository.save(empleado);
    } 
    
    public List<Empleado> consulta(){
        return empleadoRepository.findAll();
    }
    
    public void eliminar(Empleado empleado){
       empleadoRepository.delete(empleado);
    }
}
