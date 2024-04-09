package com.conectbd.conn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.conectbd.conn.model.Aluno;
import com.conectbd.conn.services.AlunoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class AlunoController {
    @Autowired
    private AlunoService as;

    @GetMapping("/listar")
    public List<Aluno> listarAlunos(){
        return (List<Aluno>) as.findAll();
    }

    @PostMapping("/criar")
    public Aluno criarAluno(@RequestBody Aluno a){
        Aluno novo = as.save(a);
        return novo;
    }
}
