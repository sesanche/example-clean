package aplication.data.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ParticitanteEntity {
    @JsonProperty("name")
    private String nombre;

    @JsonProperty("rut")
    private String rut;
}
