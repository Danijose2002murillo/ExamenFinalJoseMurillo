package com.example.proyectomongo.repository;

import com.example.proyectomongo.model.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClienteRepository extends MongoRepository<Cliente, Long> {
}
