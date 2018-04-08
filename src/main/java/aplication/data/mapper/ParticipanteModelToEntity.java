package aplication.data.mapper;

import aplication.data.entity.ParticitanteEntity;
import aplication.domain.model.ParticipanteModel;

public class ParticipanteModelToEntity {

    public static ParticipanteModel reverse(ParticitanteEntity particitanteEntity) {
        ParticipanteModel participanteModel = new ParticipanteModel();
        participanteModel.setNombre(particitanteEntity.getNombre());
        return participanteModel;
    }
}
