package com.iagofontes.carros.service;

import com.iagofontes.carros.model.Carro;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarrosService {

    private List<Carro> listaCarros = new ArrayList<>();

    public List<Carro> getCarros() {
        listaCarros.add(new Carro(1L, "Vectra"));

        return this.listaCarros;
    }

}
