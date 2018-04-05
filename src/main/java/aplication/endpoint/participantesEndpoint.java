package aplication.endpoint;

import aplication.domain.model.ParticipanteModel;
import aplication.domain.usecase.ObtenerParticipantesUseCases;
import aplication.endpoint.mapper.ParticipanteViewModelToModel;
import aplication.endpoint.modelview.ParticipanteViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/participantes")
public class participantesEndpoint {

    @Autowired
    private ObtenerParticipantesUseCases obtenerParticipantesUseCases;

    @RequestMapping(method = RequestMethod.GET)
    public List<ParticipanteViewModel> obtenerParticipantes(){
        return ParticipanteViewModelToModel.reverse(obtenerParticipantesUseCases.obtenerParticipantes());
    }

}
