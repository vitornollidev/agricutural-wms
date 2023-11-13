package com.agricultural.wms.services;

import com.agricultural.wms.dtos.FornecedorDTO;
import com.agricultural.wms.entities.Fornecedor;
import com.agricultural.wms.repositories.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FornecedorService {

    @Autowired
    FornecedorRepository repository;

    public FornecedorDTO insert(FornecedorDTO dto){
        Fornecedor fornecedor = new Fornecedor(null,dto.nome(), dto.email());
        repository.save(fornecedor);
        return new FornecedorDTO(fornecedor.getNome(), fornecedor.getEmail());
    }
}
