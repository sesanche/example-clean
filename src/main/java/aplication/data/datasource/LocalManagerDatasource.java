package aplication.data.datasource;

import aplication.data.entity.ParticitanteEntity;

public interface LocalManagerDatasource {
    ParticitanteEntity obtenerPartcipante(String rut);

    void agregarPartcipante(ParticitanteEntity particitante);
}
