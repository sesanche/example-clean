package aplication.endpoint.mapper;

import aplication.data.entity.ParticitanteEntity;
import aplication.domain.model.ParticipanteModel;
import aplication.endpoint.modelview.ParticipanteViewModel;


import java.util.ArrayList;
import java.util.List;

public class  ParticipanteViewModelToModel {
    
    
    public static List<ParticipanteViewModel> reverse(List<ParticipanteModel> particitantesModel) {
        List<ParticipanteViewModel> participantesViewModel = new ArrayList<>();
        for (ParticipanteModel particitanteModel :particitantesModel){
            ParticipanteViewModel participanteViewModel = new ParticipanteViewModel();
            participanteViewModel.setNombre(particitanteModel.getNombre());
            participantesViewModel.add(participanteViewModel);
        }
        return participantesViewModel;
    }

}
