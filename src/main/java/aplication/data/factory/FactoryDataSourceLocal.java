package aplication.data.factory;

import aplication.data.datasource.Datasource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FactoryDataSourceLocal implements Factory<Datasource> {

    @Autowired
    @Qualifier("localDataSource")
    private Datasource localDataSource;

    @Override
    public Datasource crearDataSource() {
        return localDataSource;
    }
}
