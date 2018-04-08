package aplication.data.repository;

import aplication.domain.model.ParticipanteModel;

public interface Repository {
    ParticipanteModel obtenerParticipante(String rut);
}
