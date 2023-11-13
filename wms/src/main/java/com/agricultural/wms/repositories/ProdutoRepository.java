package com.agricultural.wms.repositories;

import com.agricultural.wms.entities.Fornecedor;
import com.agricultural.wms.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
