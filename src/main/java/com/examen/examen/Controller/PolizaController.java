package com.examen.examen.Controller;

import com.examen.examen.Model.Poliza;
import com.examen.examen.Service.PolizaService;
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
@RequestMapping("/polizas")
public class PolizaController {
    
    @Autowired
    private PolizaService polizaService;
    
    @GetMapping
    public List<Poliza> consulta(){
      return polizaService.consulta();  
    }
    
    @PostMapping
    public Poliza grabar(@RequestBody Poliza poliza){
        return polizaService.grabar(poliza);
    }
    
    @PutMapping
    public Poliza actualizar(@RequestBody Poliza poliza){
        return polizaService.actualizar(poliza);
    }
    
    @DeleteMapping
    public void eliminar(@RequestBody Poliza poliza){
       polizaService.eliminar(poliza);
    }
    
}
