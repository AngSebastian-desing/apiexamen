package com.examen.examen.Repositoy;

import com.examen.examen.Model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author angel
 */
@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, Integer>{
    
}
