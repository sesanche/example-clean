package aplication.data.datasource;

import aplication.data.entity.ParticitanteEntity;

import java.util.List;

public interface LocalManagerDatasource {
    ParticitanteEntity obtenerParticipante(String rut);

    void agregarPartcipante(ParticitanteEntity particitante);

    List<ParticitanteEntity> obtenerParticipantes();
}
