package com.conectbd.conn.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.conectbd.conn.model.Aluno;
import com.conectbd.conn.repository.AlunoDAO;

@Service
public class AlunoService implements AlunoDAO {

    @Autowired
    private AlunoDAO alunoDAO;

    @Override
    public <S extends Aluno> S save(S entity) {
       return alunoDAO.save(entity);
    }

    @Override
    public <S extends Aluno> Iterable<S> saveAll(Iterable<S> entities) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveAll'");
    }

    @Override
    public Optional<Aluno> findById(Long id) {
        return alunoDAO.findById(id);
    }

    @Override
    public boolean existsById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'existsById'");
    }

    @Override
    public Iterable<Aluno> findAll() {
        return alunoDAO.findAll();
    }

    @Override
    public Iterable<Aluno> findAllById(Iterable<Long> ids) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAllById'");
    }

    @Override
    public long count() {
        return alunoDAO.count();
    }

    @Override
    public void deleteById(Long id) {
        alunoDAO.deleteById(id);
    }

    @Override
    public void delete(Aluno entity) {
        alunoDAO.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> ids) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteAllById'");
    }

    @Override
    public void deleteAll(Iterable<? extends Aluno> entities) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteAll'");
    }

    @Override
    public void deleteAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteAll'");
    }

    
    
}
