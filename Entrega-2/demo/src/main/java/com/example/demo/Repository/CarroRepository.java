package com.example.demo.Repository;

import com.example.demo.Entity.Carro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
    public interface CarroRepository extends JpaRepository<Carro, Long> {
}

