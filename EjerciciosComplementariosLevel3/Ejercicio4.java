package EjerciciosComplementariosLevel3;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Se dispone de una lista de Integer, de la cual queremos obtener otra lista
 * aplicando la operación de factorial pero no se desean valores repetidos.
 */

public class Ejercicio4 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 4, 4, 4);

        List<Integer> factorialNumeros = mapeoNumerosFactorial(numeros);

        System.out.println(factorialNumeros);

    }

    public static int calcularFactorial(int num) {
        return num==1 ? 1 : num * calcularFactorial(num - 1);
    }

    public static List<Integer> mapeoNumerosFactorial(List<Integer> numeros){
        return numeros.stream()
                .map(x -> calcularFactorial(x))
                .distinct()
                .collect(Collectors.toList());
    }
}
