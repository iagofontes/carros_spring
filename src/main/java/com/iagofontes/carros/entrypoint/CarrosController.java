package com.iagofontes.carros.entrypoint;

import com.iagofontes.carros.model.Carro;
import com.iagofontes.carros.service.CarrosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/carros")
public class CarrosController {

    @Autowired
    private CarrosService carrosService;

    @GetMapping()
    public List<Carro> listarCarros() {
        return this.carrosService.getCarros();
    }

}
