package com.example.demo.Controller;

import com.example.demo.Entity.Carro;
import com.example.demo.Services.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CarroController {
    @Autowired
    private CarroService carroService;

    @GetMapping("/carros/{id}")
    public Carro getCarro(@PathVariable Long id) {
        return carroService.getCarroById(id);
    }
}
