package aplication.data.local;

import aplication.data.entity.ParticitanteEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ParticipantesLocal implements Local {

    @Override
    public List<ParticitanteEntity> obtenerPartcipantes() {
        List participantes = new ArrayList();
        ParticitanteEntity particitanteEntityUno = new ParticitanteEntity();
        particitanteEntityUno.setNombre("Ileyn Avalos");

        ParticitanteEntity particitanteEntityDos = new ParticitanteEntity();
        particitanteEntityDos.setNombre("Constanza Salinas");

        ParticitanteEntity particitanteEntityTres = new ParticitanteEntity();
        particitanteEntityTres.setNombre("Luis Avalos");

        ParticitanteEntity particitanteEntityCuatro = new ParticitanteEntity();
        particitanteEntityCuatro.setNombre("Nadia Poniatowsky");

        participantes.add(particitanteEntityUno);
        participantes.add(particitanteEntityDos);
        participantes.add(particitanteEntityTres);
        participantes.add(particitanteEntityCuatro);


        return participantes;
    }
}
