package aplication.data.datasource;

import aplication.data.api.Api;
import aplication.data.entity.ParticitanteEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("apiDataSource")
public class ApiDataSource implements Datasource {

    @Autowired
    private Api participantApi;

    @Override
    public ParticitanteEntity obtenerPartcipante(String rut) {
        return participantApi.obtenerPartcipante(rut);
    }
}
