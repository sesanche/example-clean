package aplication.data.factory;

import aplication.data.datasource.ApiGetDatasource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FactoryDataSourceApi implements Factory<ApiGetDatasource> {

    @Autowired
    private ApiGetDatasource apiDataSource;

    @Override
    public ApiGetDatasource crearDataSource() {
        return apiDataSource;
    }
}
