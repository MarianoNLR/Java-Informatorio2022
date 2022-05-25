package EjerciciosComplementariosLevel3;

import java.util.List;

/**
 * Se dispone de una lista de Strings, de la cual saber la cantidad de valores que 
 * comiencen con la letra B (tanto mayúscula como minúscula, 
 * en ese caso decimos que será ignoreCase).
 */

public class Ejercicio3 {
 public static void main(String[] args) {
    List<String> palabras = List.of("Batman", "Aquaman", "Flash", "Batgirl",
    "Wonder Woman", "brainiac");

    long i = palabras.stream()
    .filter(x -> x.toLowerCase().startsWith("b"))
    .count();

    System.out.println(i);
    
    
 }   
}
