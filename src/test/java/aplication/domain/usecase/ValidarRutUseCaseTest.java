package aplication.domain.usecase;

import org.junit.Test;

public class ValidarRutUseCaseTest {

    @Test(expected = IllegalArgumentException.class)
    public void deberiaDevolverExceptionCuandoElRutEsVacio(){
        ValidarRutUseCase validarRutUseCase = new ValidarRutUseCase();
        String rut = "";
        validarRutUseCase.validar(rut);
    }

    @Test(expected = IllegalArgumentException.class)
    public void deberiaDevolverExceptionCuandoElRutEsNull(){
        ValidarRutUseCase validarRutUseCase = new ValidarRutUseCase();
        String rut = null;
        validarRutUseCase.validar(rut);
    }

    // test null como string
    // test validar exista guion
    // test solo numeros antes del guion
    // test digito verificador numeros y k


}