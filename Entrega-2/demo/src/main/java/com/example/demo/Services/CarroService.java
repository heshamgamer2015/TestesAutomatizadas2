package com.example.demo.Services;

import com.example.demo.Entity.Carro;
import com.example.demo.Repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarroService {
    @Autowired
    private CarroRepository carroRepository;

    public Carro getCarroById(Long id) {
        return carroRepository.findById(id).orElseThrow(() -> new RuntimeException("Carro não encontrado"));
    }
}
