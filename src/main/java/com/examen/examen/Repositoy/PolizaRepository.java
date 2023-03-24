package com.examen.examen.Repositoy;

import com.examen.examen.Model.Poliza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author angel
 */
@Repository
public interface PolizaRepository extends JpaRepository<Poliza, Integer>{
    
}
