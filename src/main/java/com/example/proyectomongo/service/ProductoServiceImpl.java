package com.example.proyectomongo.service;


import com.example.proyectomongo.model.Producto;
import com.example.proyectomongo.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductoServiceImpl extends GenericServiceImpl<Producto,Long> implements ProductoService {

    @Autowired
    ProductoRepository proyectoRepository;

    @Override
    public CrudRepository<Producto, Long> getDao() {
        return proyectoRepository;
    }

    @Override
    public Producto findById(Long aLong) {
        return null;
    }
}
