package com.products.productsapi.repository;

import com.products.productsapi.model.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<ProdutoModel, String> {

    //No generics<> passamos o nome da classe da entidade e o tipo do id.
}
