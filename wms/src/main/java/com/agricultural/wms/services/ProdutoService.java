package com.agricultural.wms.services;

import com.agricultural.wms.dtos.ProdutoDTO;
import com.agricultural.wms.entities.Produto;
import com.agricultural.wms.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {
    @Autowired
    ProdutoRepository repository;

    public ProdutoDTO insert(ProdutoDTO dto){
        Produto produto = new Produto(null, dto.nome(), dto.valor(), dto.fornecedor());
        repository.save(produto);
        return new ProdutoDTO(produto.getNome(), produto.getValor(), produto.getFornecedor());
    }
}
