package EjerciciosComplementariosLevel3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Dada una lista que contiene valores de tipo String, se deberá filtrar todos los 
 * valores que NO sean null o vacío ("").
 */

public class Ejercicio1 {
    public static void main(String[] args) {
        List<String> palabras = new ArrayList<>();
        palabras.add("Hola");
        palabras.add(null);
        palabras.add("Informatorio");
        palabras.add("");
        System.out.println(filtrarLista(palabras));

    }

    public static List<String> filtrarLista(List<String> palabras){
         return palabras.stream()
                .filter(x -> x != null)
                .filter(x -> !"".equals(x.trim()))
                .collect(Collectors.toList());
    }
}
