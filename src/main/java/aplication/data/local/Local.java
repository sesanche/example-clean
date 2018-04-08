package aplication.data.local;

import aplication.data.entity.ParticitanteEntity;

import java.util.List;

public interface Local {
    ParticitanteEntity obtenerParticipante(String rut);

    void agregarparticipante(ParticitanteEntity participante);

    List<ParticitanteEntity> obtenerParticipantes();
}
