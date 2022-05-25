package EjerciciosComplementariosLevel3;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Dada una lista que contiene números enteros, se deberá generar otra lista que
 * contendrá el resultado de aplicar la operación de potencia a 2.

 */

public class Ejercicio2 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5);

        List<Integer> cuadradoNumeros = numeros.stream().map(x -> x*x).collect(Collectors.toList());

        System.out.println(cuadradoNumeros);
    }
}
