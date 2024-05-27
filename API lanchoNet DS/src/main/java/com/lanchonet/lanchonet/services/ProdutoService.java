package com.lanchonet.lanchonet.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lanchonet.lanchonet.DTOs.ProdutoDTO;
import com.lanchonet.lanchonet.entities.Produto;
import com.lanchonet.lanchonet.exceptions.DBException;
import com.lanchonet.lanchonet.exceptions.ResourceNotFoundException;
import com.lanchonet.lanchonet.repositories.ProdutoRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository repository;

    @Transactional(readOnly = true)
    public ProdutoDTO findById(Long id){
        Produto produto = repository.findById(id).get();
        return new ProdutoDTO(produto);
    }

    @Transactional
    public ProdutoDTO insert(ProdutoDTO dto){
        Produto entity = new Produto();
        entity.setNome(dto.getNome());
        entity.setCategoria(dto.getCategoria());
        entity.setValor(dto.getValor());
        entity.setDescricao(dto.getDescricao());
        entity.setQuantidade(dto.getQuantidade());
        entity.setAtivo(dto.isAtivo());
        entity = repository.save(entity);
        return new ProdutoDTO(entity);
    }

    @Transactional
    public ProdutoDTO update(Long id, ProdutoDTO dto){
        try {
            Produto entity = repository.getReferenceById(id);
            entity.setNome(dto.getNome());
            entity.setCategoria(dto.getCategoria());
            entity.setValor(dto.getValor());
            entity.setDescricao(dto.getDescricao());
            entity.setQuantidade(dto.getQuantidade());
            entity.setAtivo(dto.isAtivo());
            entity = repository.save(entity);
            return new ProdutoDTO(entity);
        } catch (EntityNotFoundException e) {
            throw new ResourceNotFoundException("Produto não encontrado para o id: " + id);
        }
    }

    @Transactional(propagation  = Propagation.SUPPORTS)
    public void delete(Long id){
        if (!repository.existsById(id)){
            throw new ResourceNotFoundException("Produto não encontrado para o id: " + id);
        }
        try {
            repository.deleteById(id);
        } catch (DataIntegrityViolationException e) {
            throw new DBException("Violação de integridade referencial");
        }
    }
}
