package com.sinfloo.backend.Servicios;

import com.sinfloo.backend.Modelos.Producto;

import java.util.List;

public interface ProductService {

    List<Producto> listar();

    Producto listarId(int id);

    Producto add(Producto p);

    Producto edit(Producto p);

    Producto delete(int id);
}
