package aplication.data.factory;

import aplication.data.datasource.LocalManagerDatasource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FactoryDataSourceLocal implements Factory<LocalManagerDatasource> {

    @Autowired
    private LocalManagerDatasource localDataSource;

    @Override
    public LocalManagerDatasource crearDataSource() {
        return localDataSource;
    }
}
