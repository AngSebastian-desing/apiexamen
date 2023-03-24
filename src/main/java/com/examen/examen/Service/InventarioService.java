package com.examen.examen.Service;

import com.examen.examen.Model.Inventario;
import com.examen.examen.Repositoy.InventarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author angel
 */
public class InventarioService {
    
    @Autowired
    private InventarioRepository inventarioRepository;
    
    public Inventario grabar(Inventario articulo){
        return inventarioRepository.save(articulo);
    } 
    
    public Inventario actualizar(Inventario articulo){
        return inventarioRepository.save(articulo);
    } 
    
    public List<Inventario> consulta(){
        return inventarioRepository.findAll();
    }
    
    public void eliminar(Inventario articulo){
       inventarioRepository.delete(articulo);
    }
    
}
