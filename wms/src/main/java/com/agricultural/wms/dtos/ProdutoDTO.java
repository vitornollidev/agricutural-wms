package com.agricultural.wms.dtos;

import com.agricultural.wms.entities.Fornecedor;

public record ProdutoDTO(String nome, Double valor, Fornecedor fornecedor){
}
