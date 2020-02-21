package com.sinfloo.backend.Servicios;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sinfloo.backend.Repositorio.InspeccionRepositorio;
import com.sinfloo.backend.Modelos.Inspeccion;

@Service
public class InspeccionServiceImp implements  InspeccionService{

    @Autowired
    private InspeccionRepositorio repo;

    @Override
    public List<Inspeccion> listar() {
        return repo.findAll();
    }

    @Override
    public Inspeccion listarId(int id) {
        return repo.findOne(id);
    }

    @Override
    public Inspeccion add(Inspeccion p) {
        return repo.save(p);
    }

    @Override
    public Inspeccion edit(Inspeccion p) {
        return repo.save(p);
    }

    @Override
    public Inspeccion delete(int id) {
        Inspeccion p = repo.findOne(id);
        if (p != null) {
            repo.delete(p);
        }
        return p;
    }

}
