package aplication.data.datasource;

import aplication.data.entity.ParticitanteEntity;
import aplication.data.local.Local;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LocalDataSource implements Datasource {

    @Autowired
    private Local participantesLocal;

    @Override
    public ParticitanteEntity obtenerPartcipante(String rut) {
        return participantesLocal.obtenerPartcipante(rut);
    }
}
