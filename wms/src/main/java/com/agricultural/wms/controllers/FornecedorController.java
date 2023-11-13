package com.agricultural.wms.controllers;

import com.agricultural.wms.dtos.FornecedorDTO;
import com.agricultural.wms.services.FornecedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fornecedores")
public class FornecedorController {

    @Autowired
    FornecedorService service;
    @PostMapping
    public ResponseEntity<FornecedorDTO> insert(@RequestBody FornecedorDTO dto){
            return ResponseEntity.ok().body(service.insert(dto));
    }
}
