package aplication.data.repository;

import aplication.data.datasource.Datasource;
import aplication.data.factory.FactoryDataSource;
import aplication.data.mapper.ParticipanteModelToEntity;
import aplication.domain.model.ParticipanteModel;
import org.springframework.stereotype.Component;

@Component
public class RepositoryParticipante implements Repository {

    private Datasource localDataSource;

    public RepositoryParticipante(FactoryDataSource factoryLocal) {
        this.localDataSource = factoryLocal.crearDataSource();
    }

    @Override
    public ParticipanteModel obtenerParticipante(String rut) {
        return ParticipanteModelToEntity.reverse(localDataSource.obtenerPartcipante(rut));
    }
}
