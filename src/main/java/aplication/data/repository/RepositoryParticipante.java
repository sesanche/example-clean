package aplication.data.repository;

import aplication.data.datasource.Datasource;
import aplication.data.factory.FactoryDataSourceApi;
import aplication.data.mapper.ParticipanteModelToEntity;
import aplication.domain.model.ParticipanteModel;
import org.springframework.stereotype.Component;

@Component
public class RepositoryParticipante implements Repository {

    private Datasource apiDataSource;

    public RepositoryParticipante(FactoryDataSourceApi factoryApi) {
        this.apiDataSource = factoryApi.crearDataSource();
    }

    @Override
    public ParticipanteModel obtenerParticipante(String rut) {
        return ParticipanteModelToEntity.reverse(apiDataSource.obtenerPartcipante(rut));
    }
}
