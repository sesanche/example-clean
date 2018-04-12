package aplication.domain.usecase;

import org.junit.Test;

public class ValidarRutUseCaseTest {

    //assert
    @Test(expected = IllegalArgumentException.class)
    public void deberiaDevolverExceptionCuandoElRutEsVacio(){

        //arrange
        ValidarRutUseCase validarRutUseCase = new ValidarRutUseCase();
        String rutVacio = "";

        //act
        validarRutUseCase.validar(rutVacio);
    }

    @Test(expected = IllegalArgumentException.class)
    public void deberiaDevolverExceptionCuandoElRutEsNull(){
        ValidarRutUseCase validarRutUseCase = new ValidarRutUseCase();
        String rutNulo = null;
        validarRutUseCase.validar(rutNulo);
    }

    // test null como string
    // test validar exista guion
    // test solo numeros antes del guion
    // test digito verificador numeros y k


}