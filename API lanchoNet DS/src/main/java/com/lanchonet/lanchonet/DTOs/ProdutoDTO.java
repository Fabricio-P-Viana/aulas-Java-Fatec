package com.lanchonet.lanchonet.DTOs;

import com.lanchonet.lanchonet.entities.Produto;

public class ProdutoDTO {
    private Long id;
    private String nome, categoria, descricao;
    private double valor;
    private int quantidade;
    private boolean ativo;

    public ProdutoDTO() {}

    public ProdutoDTO(Long id, String nome, String categoria, double valor, String descricao, int quantidade, boolean ativo) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.valor = valor;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.ativo = ativo;
    }

    public ProdutoDTO(Produto entity) {
        this.id = entity.getId();
        this.nome = entity.getNome();
        this.categoria = entity.getCategoria();
        this.valor = entity.getValor();
        this.descricao = entity.getDescricao();
        this.quantidade = entity.getQuantidade();
        this.ativo = entity.isAtivo();
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public boolean isAtivo() {
        return ativo;
    }
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}