package aplication.data.local;

import aplication.data.entity.ParticitanteEntity;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class ParticipantesLocal implements Local {
    private Map<String, ParticitanteEntity> participantes;

    @Override
    public ParticitanteEntity obtenerPartcipante(String rut) {
        CargarParticipantes();
        return participantes.get(rut);
    }

    private void CargarParticipantes() {
        if (participantes == null) {
            participantes = new HashMap<>();
        }

        ParticitanteEntity particitanteEntityUno = new ParticitanteEntity();
        particitanteEntityUno.setNombre("Ileyn Avalos");

        ParticitanteEntity particitanteEntityDos = new ParticitanteEntity();
        particitanteEntityDos.setNombre("Constanza Salinas");

        ParticitanteEntity particitanteEntityTres = new ParticitanteEntity();
        particitanteEntityTres.setNombre("Luis Avalos");

        ParticitanteEntity particitanteEntityCuatro = new ParticitanteEntity();
        particitanteEntityCuatro.setNombre("Nadia Poniatowsky");

        participantes.put("1-0", particitanteEntityUno);
        participantes.put("2-0", particitanteEntityDos);
        participantes.put("3-0", particitanteEntityTres);
        participantes.put("4-0", particitanteEntityCuatro);
    }
}
