package com.example.demo;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.demo.Entity.Carro;
import com.example.demo.Repository.CarroRepository;
import com.example.demo.Services.CarroService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Optional;

@SpringBootTest
public class CarroServiceTest {
    @Autowired
    private CarroService carroService;

    @MockBean
    private CarroRepository carroRepository;

    @BeforeEach
    void setUp() {
        Carro carro = new Carro(1L, "Gol", "Volkswagen");
        when(carroRepository.findById(1L)).thenReturn(Optional.of(carro));
    }

    @Test
    void testGetCarroById() {
        Long id = 1L;
        Carro carro = carroService.getCarroById(id);
        assertEquals("Gol", carro.getNome(), "O nome do carro deve ser 'Gol'");
    }
}
