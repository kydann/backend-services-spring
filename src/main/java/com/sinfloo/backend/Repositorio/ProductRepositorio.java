package com.sinfloo.backend.Repositorio;

import java.util.List;

import com.sinfloo.backend.Modelos.Producto;
import org.springframework.data.repository.Repository;

public interface ProductRepositorio extends Repository<Producto, Integer> {

    List<Producto> findAll();

    Producto findOne(int id);

    Producto save(Producto p);

    void delete(Producto p);
}
