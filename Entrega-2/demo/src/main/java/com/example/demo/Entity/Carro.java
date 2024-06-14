package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Carro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String marca;

    // Corrigindo o construtor para inicializar as variáveis de instância
    public Carro(long id, String nome, String marca) {
        this.id = id;
        this.nome = nome;
        this.marca = marca;
    }
}
