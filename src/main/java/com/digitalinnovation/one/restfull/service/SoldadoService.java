package com.digitalinnovation.one.restfull.service;

import com.digitalinnovation.one.restfull.dto.Soldado;
import com.digitalinnovation.one.restfull.request.SoldadoEditRequest;
import org.springframework.stereotype.Service;

@Service
public class SoldadoService {

    public Soldado buscarSoldado(String cpf){
        Soldado soldado = new Soldado();
        soldado.setCpf(cpf);
        soldado.setNome("Legolas");
        soldado.setRaca("Elfo");
        soldado.setArma("Arco e Flexa");
        return soldado;
    }

    public void criarSoldado(Soldado soldado){

    }

    public void alterarSoldado(String cpf, SoldadoEditRequest soldadoEditRequest) {
    }
}
