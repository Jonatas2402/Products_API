package com.products.productsapi.controller;

import com.products.productsapi.model.ProdutoModel;
import com.products.productsapi.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
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

    @PostMapping
    public ProdutoModel salvar(@RequestBody ProdutoModel produto){
        //RequestBody diz pra o spring qeu o metodo salvar vai vim do Body da requisição.
        //gerando um id.
        var id = UUID.randomUUID().toString();
        produto.setId(id);
        produtoRepository.save(produto);
        return produto;
    }
    @GetMapping("{id}")
    public ProdutoModel obterPorId(@PathVariable("id") String id) {
        return produtoRepository.findById(id).orElse(null);
    }

    @DeleteMapping("{id}")
    public void deletaPorId (@PathVariable("id") String id) {
        produtoRepository.deleteById(id);
    }
    @PutMapping("{id}")

    public void atualiza(@PathVariable("id") String id, @RequestBody ProdutoModel produto) {
        produto.setId(id);
        produtoRepository.save(produto);

    }
    @GetMapping
    public List<ProdutoModel> busca(@RequestParam("nome") String nome){
        return produtoRepository.findByNome(nome);

    }
}
