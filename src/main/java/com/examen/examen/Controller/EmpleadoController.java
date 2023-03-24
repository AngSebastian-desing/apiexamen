package com.examen.examen.Controller;

import com.examen.examen.Model.Empleado;
import com.examen.examen.Service.EmpleadoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author angel
 */
@RestController
@RequestMapping("/empleados")
public class EmpleadoController {
    
    @Autowired
    private EmpleadoService empleadoService;
    
    @GetMapping
    public List<Empleado> consulta(){
      return empleadoService.consulta();  
    }
    
    @PostMapping
    public Empleado grabar(@RequestBody Empleado empleado){
        return empleadoService.grabar(empleado);
    }
    
    @PutMapping
    public Empleado actualizar(@RequestBody Empleado empleado){
        return empleadoService.actualizar(empleado);
    }
    
    @DeleteMapping
    public void eliminar(@RequestBody Empleado empleado){
       empleadoService.eliminar(empleado);
    }
    
}
