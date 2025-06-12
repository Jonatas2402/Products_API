package com.products.productsapi.model;
//POJO -> Plain Old Java Object
public class ProdutoModel {
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
