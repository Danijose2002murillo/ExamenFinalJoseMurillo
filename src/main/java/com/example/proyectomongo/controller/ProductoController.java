package com.example.proyectomongo.controller;



import com.example.proyectomongo.model.Producto;
import com.example.proyectomongo.service.ProductoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/proyectos")
public class ProductoController {

    @Autowired
    ProductoServiceImpl proyectoImpl;

    @PostMapping("/save")
    public ResponseEntity<Producto> save(@RequestBody Producto proyecto) {
        return new ResponseEntity<>(proyectoImpl.save(proyecto), HttpStatus.CREATED);
    }

    @GetMapping("/read")
    public ResponseEntity<List<Producto>> read() {
        return new ResponseEntity<>(proyectoImpl.findByAll(), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        proyectoImpl.delete(id);
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
    @GetMapping("/search/{id}")
    public ResponseEntity<Producto> search(@PathVariable Long id) {
        return new ResponseEntity<>(proyectoImpl.findById(id), HttpStatus.OK);
    }

}
