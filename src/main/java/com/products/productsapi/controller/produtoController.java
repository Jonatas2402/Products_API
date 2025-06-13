package com.products.productsapi.controller;

import com.products.productsapi.model.ProdutoModel;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//Aqui é onde será mapeado os endpoints da ap,licação.
@RestController
@RequestMapping("produtos")
public class produtoController {
    //Método para salvar um produto.
    @PostMapping
    public ProdutoModel salvar(@RequestBody ProdutoModel produto){
        System.out.println("O produto foi rcebido: " + produto);
        //RequestBody diz pra o spring qeu o metodo salvar vai vim do Body da requisição.
        return produto;
    }
}
