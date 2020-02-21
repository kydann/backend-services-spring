package com.sinfloo.backend.Servicios;

import java.util.List;
import com.sinfloo.backend.Modelos.Inspeccion;

public interface InspeccionService {


    List<Inspeccion> listar();

    Inspeccion listarId(int id);

    Inspeccion add(Inspeccion p);

    Inspeccion edit(Inspeccion p);

    Inspeccion delete(int id);

}
