package com.examen.examen.Service;

import com.examen.examen.Model.Poliza;
import com.examen.examen.Repositoy.PolizaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author angel
 */
public class PolizaService {
    
    @Autowired
    private PolizaRepository polizaRepository;
    
    public Poliza grabar(Poliza poliza){
        return polizaRepository.save(poliza);
    } 
    
    public Poliza actualizar(Poliza poliza){
         return polizaRepository.save(poliza);
    } 
    
    public List<Poliza> consulta(){
        return polizaRepository.findAll();
    }
    
    public void eliminar(Poliza poliza){
       polizaRepository.delete(poliza);
    }
}
