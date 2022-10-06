package com.example.proyectomongo.service;


import com.example.proyectomongo.model.Factura;
import com.example.proyectomongo.repository.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class FacturaServiceImpl extends GenericServiceImpl<Factura,Long> implements FacturaService {
    @Autowired
    FacturaRepository seguimientoRepository;

    @Override
    public CrudRepository<Factura, Long> getDao() {
        return seguimientoRepository;
    }

    @Override
    public Factura findById(Long aLong) {
        return null;
    }

}
