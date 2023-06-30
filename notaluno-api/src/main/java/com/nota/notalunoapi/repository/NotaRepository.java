package com.nota.notalunoapi.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nota.notalunoapi.model.Notas;
@Repository
public interface NotaRepository extends JpaRepository<Notas, Long>{

}
