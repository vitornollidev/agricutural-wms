package com.agricultural.wms.services;

import com.agricultural.wms.dtos.TransportadoraDTO;
import com.agricultural.wms.entities.Transportadora;
import com.agricultural.wms.repositories.TransportadoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransportadoraService {

    @Autowired
    TransportadoraRepository repository;

    public TransportadoraDTO insert(TransportadoraDTO dto){
        Transportadora transportadora = new Transportadora(null, dto.nome(), dto.cidade());
        repository.save(transportadora);
        return new TransportadoraDTO(transportadora.getNome(), transportadora.getCidade());
    }

}
