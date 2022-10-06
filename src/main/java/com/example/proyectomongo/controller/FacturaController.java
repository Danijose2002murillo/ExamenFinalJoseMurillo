package com.example.proyectomongo.controller;

import com.example.proyectomongo.model.Factura;
import com.example.proyectomongo.service.FacturaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/seguimiento")
public class FacturaController {

    @Autowired
    FacturaServiceImpl seguimientoImpl;

    @PostMapping("/save")
    public ResponseEntity<Factura> save(@RequestBody Factura seguimiento) {
        return new ResponseEntity<>(seguimientoImpl.save(seguimiento), HttpStatus.CREATED);
    }

    @GetMapping("/read")
    public ResponseEntity<List<Factura>> read() {
        return new ResponseEntity<>(seguimientoImpl.findByAll(), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        seguimientoImpl.delete(id);
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
    @GetMapping("/search/{id}")
    public ResponseEntity<Factura> search(@PathVariable Long id) {
        return new ResponseEntity<>(seguimientoImpl.findById(id), HttpStatus.OK);
    }

}
