package aplication.domain.usecase;

import aplication.data.repository.Repository;
import aplication.data.repository.RepositoryParticipante;
import aplication.domain.model.ParticipanteModel;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class ObtenerParticipanteUseCasesTest {


    @Test
    public void DeberiaDevolverParticipanteModelConNombreCorrectoCuandoSePasaRutValido(){
        //arrange
        ParticipanteModel participanteModelEsperado = new ParticipanteModel();
        ParticipanteModel participanteModelResp;
        String rutValido = "14354986-0";

        participanteModelEsperado.setNombre("sanchez reyes sergio alejandro");

        //mock del repositorio (consulta la API)
        Repository repository = mock(RepositoryParticipante.class);
        when(repository.obtenerParticipante(rutValido)).thenReturn(participanteModelEsperado);

        //mock de la validacion del rut
        ValidarRutUseCase validarRut = mock(ValidarRutUseCase.class);
        when(validarRut.validar(rutValido)).thenReturn(true);


        //buscar como hace sin los set, utilizar mock, @runner mirando la libreria
        ObtenerParticipanteUseCases obtenerParticipanteUseCases = new ObtenerParticipanteUseCases();
        obtenerParticipanteUseCases.setValidarRutUseCase(validarRut);
        obtenerParticipanteUseCases.setRepositoryParticipantes(repository);

        //act

        participanteModelResp = obtenerParticipanteUseCases.obtenerParticipante(rutValido);

        //assert

        assertEquals(participanteModelEsperado, participanteModelResp);
    }


    @Test
    public void DeberiaDevolverParticipanteModelConControlSalidaCuandoSePasaRutNoValido(){
        //arrange
        ParticipanteModel participanteModelEsperado = new ParticipanteModel();
        ParticipanteModel participanteModelResp;
        String rutNoValido = "14a54986-0";

        participanteModelEsperado.setNombre("Rut Invalido");

        //mock del repositorio (consulta la API)
        Repository repository = mock(RepositoryParticipante.class);
        when(repository.obtenerParticipante(rutNoValido)).thenReturn(participanteModelEsperado);

        //mock de la validacion del rut
        ValidarRutUseCase validarRut = mock(ValidarRutUseCase.class);
        when(validarRut.validar(rutNoValido)).thenReturn(false);

        //buscar como hace sin los set, utilizar mock, @runner mirando la libreria
        ObtenerParticipanteUseCases obtenerParticipanteUseCases = new ObtenerParticipanteUseCases();
        obtenerParticipanteUseCases.setValidarRutUseCase(validarRut);
        obtenerParticipanteUseCases.setRepositoryParticipantes(repository);

        //act

        participanteModelResp = obtenerParticipanteUseCases.obtenerParticipante(rutNoValido);

        //assert

        assertEquals(participanteModelEsperado, participanteModelResp);
    }


}
