package aplication.domain.usecase;

import aplication.data.repository.Repository;
import aplication.domain.model.ParticipanteModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ObtenerParticipanteUseCases {

    @Autowired
    private Repository repositoryParticipantes;

    @Autowired
    private ValidarRutUseCase validarRutUseCase;

    public ParticipanteModel obtenerParticipante(String rut) {
        if (validarRutUseCase.validar(rut)) {
            return repositoryParticipantes.obtenerParticipante(rut);
        }
        else {
            ParticipanteModel participanteModel = new ParticipanteModel();
            participanteModel.setNombre("Rut Invalido");
            return participanteModel;
        }

    }

    public List<ParticipanteModel> obtenerParticipantes() {
        return repositoryParticipantes.obtenerParticipantes();
    }

}
