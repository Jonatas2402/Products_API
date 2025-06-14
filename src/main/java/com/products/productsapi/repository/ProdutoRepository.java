package com.products.productsapi.repository;

import com.products.productsapi.model.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<ProdutoModel, String> {
    //Cria método para pesquisar por nome.
    List<ProdutoModel> findByNome(String nome);
}
