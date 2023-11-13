package com.agricultural.wms.repositories;

import com.agricultural.wms.entities.Estoque;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstoqueRepository extends JpaRepository<Estoque, Long> {
}
