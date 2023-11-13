package com.agricultural.wms.controllers;

import com.agricultural.wms.dtos.EstoqueDTO;
import com.agricultural.wms.services.EstoqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estoques")
public class EstoqueController {
    @Autowired
    EstoqueService service;

    @PostMapping
    public ResponseEntity<EstoqueDTO> insert(@RequestBody EstoqueDTO dto){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.insert(dto));
    }
    @GetMapping
    public ResponseEntity<List<EstoqueDTO>> findAll(){
        return ResponseEntity.ok().body(service.findAll());
    }
}
