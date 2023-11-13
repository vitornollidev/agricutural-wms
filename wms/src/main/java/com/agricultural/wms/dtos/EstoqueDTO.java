package com.agricultural.wms.dtos;

import com.agricultural.wms.entities.Produto;

public record EstoqueDTO (Long quantidade, Produto produto){
}
