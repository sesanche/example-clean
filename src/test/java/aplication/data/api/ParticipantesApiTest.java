package aplication.data.api;

import aplication.data.entity.ParticitanteEntity;
import org.junit.Test;
import static org.junit.Assert.*;


public class ParticipantesApiTest {

    @Test
    public void DadoUnRutValidoRetornaPersonaEntityConNombre(){
        //arrange
        ParticipantesApi participantesApi = new ParticipantesApi();
        ParticitanteEntity particitanteEntityEsperado = new ParticitanteEntity();
        particitanteEntityEsperado.setNombre("sanchez reyes sergio alejandro");
        particitanteEntityEsperado.setRut("143549860");
        ParticitanteEntity particitanteEntityRecuperado = new ParticitanteEntity();


        //act
        particitanteEntityRecuperado = participantesApi.obtenerPartcipante("143549860");

        //assert
        assertEquals(particitanteEntityEsperado, particitanteEntityRecuperado);
    }


    @Test
    public void DadoUnRutInexistenteRetornaPersonaEntityConNombre(){
        //arrange
        ParticipantesApi participantesApi = new ParticipantesApi();
        ParticitanteEntity particitanteEntityEsperado = new ParticitanteEntity();
        particitanteEntityEsperado.setNombre("No encontrado");
        particitanteEntityEsperado.setRut("");
        ParticitanteEntity particitanteEntityRecuperado = new ParticitanteEntity();


        //act
        particitanteEntityRecuperado = participantesApi.obtenerPartcipante("1-9");

        //assert
        assertEquals(particitanteEntityEsperado, particitanteEntityRecuperado);
    }




}
