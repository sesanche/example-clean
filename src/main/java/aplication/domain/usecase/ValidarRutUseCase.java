package aplication.domain.usecase;

import org.springframework.stereotype.Component;

@Component
public class ValidarRutUseCase {
    public void validar(String rut) {
        if (rut == null  || rut.isEmpty()){
            throw new IllegalArgumentException("El rut es invalido");
        }
    }
}
