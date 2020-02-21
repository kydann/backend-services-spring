package com.sinfloo.backend.Servicios;

import java.util.List;

import com.sinfloo.backend.Modelos.Producto;
import com.sinfloo.backend.Repositorio.ProductRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImp implements ProductService {

    @Autowired
    private ProductRepositorio repositorio;

    @Override
    public List<Producto> listar() {
        return repositorio.findAll();
    }

    @Override
    public Producto listarId(int id) {
        return repositorio.findOne(id);
    }

    @Override
    public Producto add(Producto p) {
        return repositorio.save(p);
    }

    @Override
    public Producto edit(Producto p) {
        return repositorio.save(p);
    }

    @Override
    public Producto delete(int id) {
        Producto p = repositorio.findOne(id);
        if (p != null) {
            repositorio.delete(p);
        }
        return p;
    }

}
