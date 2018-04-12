package aplication.domain.usecase;

import org.springframework.stereotype.Component;

@Component
public class ValidarRutUseCase {
    public Boolean validar(String rut) {

        if (rut == null  || rut.isEmpty()){
            throw new IllegalArgumentException("El rut es invalido");
        }

        if (!rut.matches("^\\d{1,3}[.]?\\d{1,3}[.]?\\d{1,3}-(\\d|k|K){1}$")){
            return false;
        }

        String [] temprut = rut.split("-");
        temprut[0] = temprut[0].replaceAll("[.]", "");

        return temprut[1].toUpperCase().equals(this.dv(temprut[0]));
    }

    public String dv(String rut) {
        Integer M=0,S=1,T=Integer.parseInt(rut);
        for (;T!=0;T=(int) Math.floor(T/=10))
            S=(S+T%10*(9-M++%6))%11;

        return ( S > 0 ) ? String.valueOf(S-1) : "K";
    }
}
