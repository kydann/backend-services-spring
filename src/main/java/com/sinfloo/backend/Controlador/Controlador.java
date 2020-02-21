package com.sinfloo.backend.Controlador;

import java.util.List;

import com.sinfloo.backend.Modelos.Producto;
import com.sinfloo.backend.Servicios.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sinfloo.backend.Servicios.InspeccionService;
import com.sinfloo.backend.Modelos.Inspeccion;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping
public class Controlador {

    @Autowired
    ProductService productService;

    @GetMapping(path = {"/producto/"})
    public List<Producto> listar() {
        return productService.listar();
    }

    @PostMapping(path = {"/producto/"})
    public Producto agregar(@RequestBody Producto p) {
        return productService.add(p);
    }

    @GetMapping(path = {"/producto/{id}"})
    public Producto listarId(@PathVariable("id") int id) {
        return productService.listarId(id);
    }

    @PutMapping(path = {"/producto/{id}"})
    public Producto editar(@RequestBody Producto p, @PathVariable("id") int id) {
        p.setId(id);
        return productService.edit(p);
    }

    @DeleteMapping(path = {"/producto/{id}"})
    public Producto delete(@PathVariable("id") int id) {
        return productService.delete(id);
    }
    
    @Autowired
    InspeccionService inspectService;

    @GetMapping(path = {"/inspeccion"})
    public List<Inspeccion> listarInspect() {
        return inspectService.listar();
    }

    @PostMapping(path = {"/inspeccion/"})
    public Inspeccion agregarInspect(@RequestBody Inspeccion inspec) {
        return inspectService.add(inspec);
    }

    @GetMapping(path = {"/inspeccion/{id}"})
    public Inspeccion listarIdInspect(@PathVariable("id") int id) {
        return inspectService.listarId(id);
    }

    @PutMapping(path = {"/inspeccion/{id}"})
    public Inspeccion editarInspect(@RequestBody Inspeccion i, @PathVariable("id") int id) {
        i.setId(id);
        return inspectService.edit(i);
    }

    @DeleteMapping(path = {"/inspeccion/{id}"})
    public Inspeccion deleteInspect(@PathVariable("id") int id) {
        return inspectService.delete(id);
    }

}
