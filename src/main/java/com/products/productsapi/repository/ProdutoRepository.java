package com.products.productsapi.repository;

import com.products.productsapi.model.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<ProdutoModel, String> {


}
