package aplication.data.repository;

import aplication.data.datasource.ApiGetDatasource;
import aplication.data.datasource.LocalManagerDatasource;
import aplication.data.factory.FactoryDataSourceApi;
import aplication.data.factory.FactoryDataSourceLocal;
import aplication.data.mapper.ParticipanteModelToEntity;
import aplication.domain.model.ParticipanteModel;
import org.springframework.stereotype.Component;

@Component
public class RepositoryParticipante implements Repository {

    private LocalManagerDatasource localDataSource;

    private ApiGetDatasource apiDataSource;

    public RepositoryParticipante(FactoryDataSourceApi factoryApi, FactoryDataSourceLocal factoryLocal) {
        this.apiDataSource = factoryApi.crearDataSource();
        this.localDataSource = factoryLocal.crearDataSource();
    }

    @Override
    public ParticipanteModel obtenerParticipante(String rut) {
        ParticipanteModel participanteModel = ParticipanteModelToEntity.reverse(localDataSource.obtenerPartcipante(rut));
        if (participanteModel.getNombre() == null) {
            participanteModel = ParticipanteModelToEntity.reverse(apiDataSource.obtenerPartcipante(rut));
            localDataSource.agregarPartcipante(apiDataSource.obtenerPartcipante(rut));
        }
        return participanteModel;
    }
}
