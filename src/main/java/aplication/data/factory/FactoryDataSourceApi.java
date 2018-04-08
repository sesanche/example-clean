package aplication.data.factory;

import aplication.data.datasource.Datasource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FactoryDataSourceApi implements Factory<Datasource> {

    @Autowired
    @Qualifier("apiDataSource")
    private Datasource apiDataSource;

    @Override
    public Datasource crearDataSource() {
        return apiDataSource;
    }
}
