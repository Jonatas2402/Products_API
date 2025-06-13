package com.products.productsapi.controller;

import com.products.productsapi.model.ProdutoModel;
import com.products.productsapi.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

//Aqui é onde será mapeado os endpoints da ap,licação.
@RestController
@RequestMapping("produtos")
public class produtoController {
    //Instanciando produtoRepository para obter os metodos CRUD.
    private ProdutoRepository produtoRepository;

    public produtoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    //Método para salvar um produto.
    @PostMapping
    public ProdutoModel salvar(@RequestBody ProdutoModel produto){
        System.out.println("O produto foi rcebido: " + produto);
        //RequestBody diz pra o spring qeu o metodo salvar vai vim do Body da requisição.
        //gerando um id.
        var id = UUID.randomUUID().toString();
        produto.setId(id);
        return produtoRepository.save(produto);

    }
    @GetMapping("{id}")
    public ProdutoModel obterPorId(@PathVariable("id") String id) {
        return produtoRepository.findById(id).orElse(null);
    }
    @DeleteMapping("{id}")
    public void deletaPorId (@PathVariable("id") String id) {
        produtoRepository.deleteById(id);
    }
}
