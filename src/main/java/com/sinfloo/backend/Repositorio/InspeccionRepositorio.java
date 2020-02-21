package com.sinfloo.backend.Repositorio;

import java.util.List;
import com.sinfloo.backend.Modelos.Inspeccion;
import org.springframework.data.repository.Repository;

public interface InspeccionRepositorio extends Repository<Inspeccion, Integer> {

    List<Inspeccion> findAll();

    Inspeccion findOne(int id);

    Inspeccion save(Inspeccion i);

    void delete(Inspeccion i);

}
