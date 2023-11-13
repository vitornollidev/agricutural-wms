package com.agricultural.wms.services;

import com.agricultural.wms.dtos.EstoqueDTO;
import com.agricultural.wms.entities.Estoque;
import com.agricultural.wms.repositories.EstoqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EstoqueService {
    @Autowired
    EstoqueRepository repository;

    public EstoqueDTO insert(EstoqueDTO dto){
        Estoque estoque = new Estoque(null, dto.quantidade(), dto.produto());
        repository.save(estoque);
        return new EstoqueDTO(estoque.getQuantidade(), estoque.getProduto());
    }
    public List<EstoqueDTO> findAll(){
        List<Estoque> list = repository.findAll();
        return list.stream().map(x -> new EstoqueDTO(x.getQuantidade(), x.getProduto())).toList();
    }
}
