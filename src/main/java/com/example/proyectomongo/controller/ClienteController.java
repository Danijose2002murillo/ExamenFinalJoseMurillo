package com.example.proyectomongo.controller;

import com.example.proyectomongo.model.Cliente;
import com.example.proyectomongo.service.ClienteServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/personas")
public class ClienteController {

    @Autowired
    ClienteServiceImpl personaImpl;

    @PostMapping("/save")
    public ResponseEntity<Cliente> save(@RequestBody Cliente persona) {
        return new ResponseEntity<>(personaImpl.save(persona), HttpStatus.CREATED);
    }

    @GetMapping("/read")
    public ResponseEntity<List<Cliente>> read() {
        return new ResponseEntity<>(personaImpl.findByAll(), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        personaImpl.delete(id);
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
    @GetMapping("/search/{id}")
    public ResponseEntity<Cliente> search(@PathVariable Long id) {
        return new ResponseEntity<>(personaImpl.findById(id), HttpStatus.OK);
    }
}
