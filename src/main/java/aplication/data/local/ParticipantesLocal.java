package aplication.data.local;

import aplication.data.entity.ParticitanteEntity;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class ParticipantesLocal implements Local {
    private Map<String, ParticitanteEntity> participantes = new HashMap<>();

    @Override
    public ParticitanteEntity obtenerParticipante(String rut) {
        CargarParticipantes();
        return getParticitanteEntity(rut);
    }

    @Override
    public void agregarparticipante(ParticitanteEntity participante) {
        participantes.put(participante.getRut(), participante);
    }

    private ParticitanteEntity getParticitanteEntity(String rut) {
        if (participantes.containsKey(rut)) {
            return participantes.get(rut);
        }
        return new ParticitanteEntity();
    }

    private void CargarParticipantes() {
        ParticitanteEntity particitanteEntityUno = new ParticitanteEntity();
        particitanteEntityUno.setNombre("Ileyn Avalos");
        particitanteEntityUno.setRut("1-0");

        ParticitanteEntity particitanteEntityDos = new ParticitanteEntity();
        particitanteEntityDos.setNombre("Constanza Salinas");
        particitanteEntityDos.setRut("2-0");

        ParticitanteEntity particitanteEntityTres = new ParticitanteEntity();
        particitanteEntityTres.setNombre("Luis Avalos");
        particitanteEntityTres.setRut("3-0");

        ParticitanteEntity particitanteEntityCuatro = new ParticitanteEntity();
        particitanteEntityCuatro.setNombre("Nadia Poniatowsky");
        particitanteEntityCuatro.setRut("4-0");

        agregarparticipante(particitanteEntityUno);
        agregarparticipante(particitanteEntityDos);
        agregarparticipante(particitanteEntityTres);
        agregarparticipante(particitanteEntityCuatro);
    }
}
