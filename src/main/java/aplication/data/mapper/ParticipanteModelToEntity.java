package aplication.data.mapper;

import aplication.data.entity.ParticitanteEntity;
import aplication.domain.model.ParticipanteModel;

import java.util.ArrayList;
import java.util.List;

public class ParticipanteModelToEntity {

    public static ParticipanteModel reverse(ParticitanteEntity particitanteEntity) {
        ParticipanteModel participanteModel = new ParticipanteModel();
        participanteModel.setNombre(particitanteEntity.getNombre());
        return participanteModel;
    }

    public static List<ParticipanteModel> reverse(List<ParticitanteEntity> particitantesEntity) {
        List<ParticipanteModel> participanteModels = new ArrayList<>();
        for (ParticitanteEntity particitanteEntity : particitantesEntity) {
            participanteModels.add(reverse(particitanteEntity));
        }
        return participanteModels;
    }

}
