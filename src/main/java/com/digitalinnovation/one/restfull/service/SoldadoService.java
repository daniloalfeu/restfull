package com.digitalinnovation.one.restfull.service;

import com.digitalinnovation.one.restfull.dto.Soldado;
import com.digitalinnovation.one.restfull.request.SoldadoEditRequest;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

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

    public void deletarSoldado(String cpf) {

    }
    public List<Soldado> buscarSoldados(){
        Soldado soldado1 = new Soldado();
        soldado1.setCpf("123456789");
        soldado1.setNome("Legolas");
        soldado1.setRaca("Elfo");
        soldado1.setArma("Arco e Flexa");
        Soldado soldado2 = new Soldado();
        soldado2.setCpf("987654321");
        soldado2.setNome("Alfeu");
        soldado2.setRaca("humando");
        soldado2.setArma("machado");


        return Arrays.asList(soldado1,soldado2);
    }

}
