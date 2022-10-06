package com.example.proyectomongo.repository;



import com.example.proyectomongo.model.Factura;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FacturaRepository extends MongoRepository<Factura, Long> {
}
