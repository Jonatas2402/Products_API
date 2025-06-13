package com.products.productsapi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//POJO -> Plain Old Java Object
@Entity
@Table(name = "produto")
public class ProdutoModel {

    @Id
    private String id;
    private String nome;
    private String descricao;
    private double preco;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String name) {
        this.nome = name;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "id='" + id  +
                ", nome: " + nome  +
                ", descrição: " + descricao +
                ", preço: " + preco;
    }
}
