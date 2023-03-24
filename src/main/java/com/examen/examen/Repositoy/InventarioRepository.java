package com.examen.examen.Repositoy;

import com.examen.examen.Model.Inventario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author angel
 */
@Repository
public interface InventarioRepository extends JpaRepository<Inventario, Integer> {
    
}
