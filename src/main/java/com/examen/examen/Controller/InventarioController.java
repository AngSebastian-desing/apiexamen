package com.examen.examen.Controller;


import com.examen.examen.Model.Inventario;
import com.examen.examen.Service.InventarioService;
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
@RequestMapping("/inventario")
public class InventarioController {
    
    @Autowired
    private InventarioService inventarioService;
    
    
    @GetMapping
    public List<Inventario> consulta(){
      return inventarioService.consulta();  
    }
    
    @PostMapping
    public Inventario grabar(@RequestBody Inventario articulo){
        return inventarioService.grabar(articulo);
    }
    
    @PutMapping
    public Inventario actualizar(@RequestBody Inventario articulo){
        return inventarioService.actualizar(articulo);
    }
    
    @DeleteMapping
    public void eliminar(@RequestBody Inventario articulo){
       inventarioService.eliminar(articulo);
    }


}
