package aplication.endpoint.mapper;

import aplication.domain.model.ParticipanteModel;
import aplication.endpoint.modelview.ParticipanteViewModel;

public class  ParticipanteViewModelToModel {


    public static ParticipanteViewModel reverse(ParticipanteModel particitanteModel) {
        ParticipanteViewModel participanteViewModel = new ParticipanteViewModel();
        participanteViewModel.setNombre(particitanteModel.getNombre());
        return participanteViewModel;
    }

}
