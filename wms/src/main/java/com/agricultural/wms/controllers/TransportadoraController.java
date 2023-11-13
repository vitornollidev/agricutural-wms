package com.agricultural.wms.controllers;

import com.agricultural.wms.dtos.TransportadoraDTO;
import com.agricultural.wms.services.TransportadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transportadoras")
public class TransportadoraController {

    @Autowired
    TransportadoraService transportadoraService;

    @PostMapping
    public ResponseEntity<TransportadoraDTO> insert(@RequestBody TransportadoraDTO dto){
        return ResponseEntity.ok().body(transportadoraService.insert(new TransportadoraDTO(dto.nome(), dto.cidade())));
    }

}
