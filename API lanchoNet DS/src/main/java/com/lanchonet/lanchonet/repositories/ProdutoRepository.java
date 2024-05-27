package com.lanchonet.lanchonet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lanchonet.lanchonet.entities.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
    
}
