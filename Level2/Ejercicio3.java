package Level2;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Crear una lista que contenga como elementos la numeración de cartas de una
 * baraja francesa (solo los valores, no figuras). Se deberá cargar el ArrayList (en orden),
 *  imprimir, imprimir en orden inverso (reverse), desordenar (mezclar) el 
 * arrayList y volver a imprimir.
 */

public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList<Integer> cartas = new ArrayList<Integer>();
        agregarValores(cartas);
        
        //Imprime cartas recien cargadas
        System.out.println("Cartas recien cargadas: ");
        System.out.println(cartas);

        System.out.println();

        //Imprime cartas en orden inverso
        Collections.reverse(cartas);
        System.out.println("Cartas en orden inverso: ");
        System.out.println(cartas);

        System.out.println();

        //Imprime cartas mezcladas
        Collections.shuffle(cartas);
        System.out.println("Cartas mezcladas: ");
        System.out.println(cartas);
    }

    public static void agregarValores(ArrayList<Integer> cartas){
        for (int i = 1; i < 10; i++) {
            cartas.add(i);
        }
    }
}
