package aplication.domain.usecase;

import org.junit.Test;
import static org.junit.Assert.*;

public class ValidarRutUseCaseTest {

    //assert
    @Test(expected = IllegalArgumentException.class)
    public void deberiaDevolverExceptionCuandoElRutEsVacio(){

        //arrange
        ValidarRutUseCase validarRutUseCase = new ValidarRutUseCase();
        String rutVacio = "";

        //act
        assertTrue (validarRutUseCase.validar(rutVacio));
    }

    //assert
    @Test(expected = IllegalArgumentException.class)
    public void deberiaDevolverExceptionCuandoElRutEsNull(){

        //arrange
        ValidarRutUseCase validarRutUseCase = new ValidarRutUseCase();
        String rutNulo = null;


        //act
        assertTrue (validarRutUseCase.validar(rutNulo));
    }

    //sergio
    @Test
    public void deberiaDevolverTrueCuandoElRutEsValido(){
        //arrange
        ValidarRutUseCase validarRutUseCase = new ValidarRutUseCase();
        String rutValido = "14354986-0";

        //act and assert
        assertTrue (validarRutUseCase.validar(rutValido));
    }


    @Test
    public void deberiaDevolverTrueCuandoElRutEsValidoPeroInexistente(){
        //arrange
        ValidarRutUseCase validarRutUseCase = new ValidarRutUseCase();
        String rutValidoInexistente = "1-9";

        //act and assert
        assertTrue (validarRutUseCase.validar(rutValidoInexistente));

    }


    @Test
    public void deberiaDevolverFalseCuandoPasaPuntoDecimal(){
        //arrange
        ValidarRutUseCase validarRutUseCase = new ValidarRutUseCase();
        String rutNocompletadecimales = "143.549.86-0";

        //act and assert
        assertFalse (validarRutUseCase.validar(rutNocompletadecimales));

    }

    @Test
    public void deberiaDevolverFalseCuandoSoloPasaDV(){
        //arrange
        ValidarRutUseCase validarRutUseCase = new ValidarRutUseCase();
        String rutsoloDV = "-0";

        //act and assert
        assertFalse (validarRutUseCase.validar(rutsoloDV));

    }


    @Test
    public void deberiaDevolverFalseCuandoElRutNoCumpleModuloOnce(){
        //arrange
        ValidarRutUseCase validarRutUseCase = new ValidarRutUseCase();
        String rutNoCumpleModulo11 = "14354986-K";

        //act and assert
        assertFalse (validarRutUseCase.validar(rutNoCumpleModulo11));
    }

    @Test
    public void deberiaDevolverFalseCuandoElRutNoTieneGuion(){
        //arrange
        ValidarRutUseCase validarRutUseCase = new ValidarRutUseCase();
        String rutSinGuion = "143549860";

        //act and assert
        assertFalse (validarRutUseCase.validar(rutSinGuion));
    }

    @Test
    public void deberiaDevolverFalseCuandoElRutContieneLetrasAntesDelGuion(){
        //arrange
        ValidarRutUseCase validarRutUseCase = new ValidarRutUseCase();
        String rutConLetrasAntesDelGuion = "1435A986-0";

        //act and assert
        assertFalse (validarRutUseCase.validar(rutConLetrasAntesDelGuion));
    }

    @Test
    public void deberiaDevolverFalseCuandoElDVNoEsUnValorPermitido(){
        //arrange
        ValidarRutUseCase validarRutUseCase = new ValidarRutUseCase();
        String rutConDVFueraDeFormato = "14354986-A";

        //act and assert
        assertFalse (validarRutUseCase.validar(rutConDVFueraDeFormato));
    }


    @Test
    public void deberiaDevolverTrueCuandoElRutContienePuntosAcordeAFormato(){
        //arrange
        ValidarRutUseCase validarRutUseCase = new ValidarRutUseCase();
        String rutEnFormato = "14.354.986-0";

        //act and assert
        assertTrue (validarRutUseCase.validar(rutEnFormato));

    }

    @Test
    public void deberiaDevolverFalseCuandoElRutContienePuntosFueraDeFormato(){
        //arrange
        ValidarRutUseCase validarRutUseCase = new ValidarRutUseCase();
        String rutFueraDeFormato = "14.35.4.986-0";

        //act and assert
        assertFalse (validarRutUseCase.validar(rutFueraDeFormato));

    }


}