package aplication.data.local;

import aplication.data.entity.ParticitanteEntity;

public interface Local {
    ParticitanteEntity obtenerParticipante(String rut);

    void agregarparticipante(ParticitanteEntity participante);
}
