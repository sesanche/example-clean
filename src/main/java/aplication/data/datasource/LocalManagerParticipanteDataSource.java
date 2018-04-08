package aplication.data.datasource;

import aplication.data.entity.ParticitanteEntity;
import aplication.data.local.Local;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class LocalManagerParticipanteDataSource implements LocalManagerDatasource {

    @Autowired
    private Local participantesLocal;

    @Override
    public ParticitanteEntity obtenerPartcipante(String rut) {
        return participantesLocal.obtenerParticipante(rut);
    }

    @Override
    public void agregarPartcipante(ParticitanteEntity particitante) {
        participantesLocal.agregarparticipante(particitante);
    }


}
