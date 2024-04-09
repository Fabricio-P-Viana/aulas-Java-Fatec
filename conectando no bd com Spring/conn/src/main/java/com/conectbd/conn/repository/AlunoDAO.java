package com.conectbd.conn.repository;

import org.springframework.data.repository.CrudRepository;
import com.conectbd.conn.model.Aluno;

public interface AlunoDAO extends CrudRepository <Aluno, Long> {
    
}
