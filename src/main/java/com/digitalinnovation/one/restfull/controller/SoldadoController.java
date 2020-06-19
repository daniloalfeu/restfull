package com.digitalinnovation.one.restfull.controller;

import com.digitalinnovation.one.restfull.dto.Soldado;
import com.digitalinnovation.one.restfull.request.SoldadoEditRequest;
import com.digitalinnovation.one.restfull.service.SoldadoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/soldado")
public class SoldadoController {
    private SoldadoService soldadoService;

    public SoldadoController (SoldadoService soldadoService){
        this.soldadoService = soldadoService;
    }

    @GetMapping("/{cpf}")
    public ResponseEntity buscarSoldado(@PathVariable () String cpf){
        Soldado soldado = soldadoService.buscarSoldado(cpf);
        return ResponseEntity.status(HttpStatus.OK).body(soldado);
    }

    @PostMapping
    public ResponseEntity criarSoldado(@RequestBody Soldado soldado) {
        soldadoService.criarSoldado(soldado);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping("{cpf}")
    public ResponseEntity editarSoldado(@PathVariable () String cpf,
                                        @RequestBody SoldadoEditRequest soldadoEditRequest){
        soldadoService.alterarSoldado(cpf, soldadoEditRequest);
        return ResponseEntity.ok().build();

    }




}
