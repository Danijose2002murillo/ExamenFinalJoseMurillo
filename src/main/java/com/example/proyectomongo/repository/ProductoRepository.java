package com.example.proyectomongo.repository;


import com.example.proyectomongo.model.Producto;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductoRepository extends MongoRepository<Producto, Long> {
}
