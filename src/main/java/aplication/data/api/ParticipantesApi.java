package aplication.data.api;

import aplication.data.entity.ParticitanteEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Component
public class ParticipantesApi implements Api {

    private final String HTTPS_API_RUTIFY_SEARCH = "https://api.rutify.cl/search?q=";

    @Override
    public ParticitanteEntity obtenerPartcipante(String rut) {
        ParticitanteEntity[] responseApiArray;
        RestTemplate restTemplate = new RestTemplate();
        responseApiArray = restTemplate.getForObject(getUrlSearch(rut), ParticitanteEntity[].class);
        return getParticitanteEntity(responseApiArray);
    }

    private String getUrlSearch(String rut) {
        return HTTPS_API_RUTIFY_SEARCH + rut;
    }

    private ParticitanteEntity getParticitanteEntity(ParticitanteEntity[] responseApiArray) {
        List<ParticitanteEntity> listParticitanteEntity = Arrays.asList(responseApiArray);
        if (listParticitanteEntity.isEmpty()) {
            ParticitanteEntity particitanteEntityResponse = new ParticitanteEntity();
            particitanteEntityResponse.setRut("");
            particitanteEntityResponse.setNombre("No encontrado");
            return particitanteEntityResponse;

        }
        return listParticitanteEntity.get(0);
    }
}
