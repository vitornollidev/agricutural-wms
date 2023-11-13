package com.agricultural.wms.controllers;

import com.agricultural.wms.dtos.ProdutoDTO;
import com.agricultural.wms.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    ProdutoService service;

    @PostMapping
    public ResponseEntity<ProdutoDTO> insert(@RequestBody ProdutoDTO dto){
        return ResponseEntity.ok().body(service.insert(dto));
    }

}
