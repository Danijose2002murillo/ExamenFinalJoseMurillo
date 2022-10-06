package com.example.proyectomongo.service;

import com.example.proyectomongo.model.Cliente;
import com.example.proyectomongo.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl extends GenericServiceImpl<Cliente,Long> implements ClienteService {



    @Autowired
    ClienteRepository personaRepository;


    @Override
    public CrudRepository<Cliente, Long> getDao() {
        return personaRepository;
    }

    @Override
    public Cliente findById(Long aLong) {
        return null;
    }
}
