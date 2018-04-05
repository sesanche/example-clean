package aplication.data.mapper;

import aplication.data.entity.ParticitanteEntity;
import aplication.domain.model.ParticipanteModel;

import java.util.ArrayList;
import java.util.List;

public class ParticipanteModelToEntity {

    public static List<ParticipanteModel> reverse(List<ParticitanteEntity> particitanteEntities) {
        List<ParticipanteModel> participantesModel = new ArrayList<>();
        for (ParticitanteEntity particitanteEntity :particitanteEntities){
            ParticipanteModel participanteModel = new ParticipanteModel();
            participanteModel.setNombre(particitanteEntity.getNombre());
            participantesModel.add(participanteModel);
        }
        return participantesModel;
    }
}
