package Level2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Crear un ArrayList y cargarlo con tus ciudades favoritas de Argentina, 
 * luego imprimir por pantalla el ranking.
 */

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> ciudades = new ArrayList<String>();
        for (int i = 0; i < 3; i++) {
            System.out.println(String.format("Ingrese la ciudad %d: ", (i+1)));
            ciudades.add(sc.nextLine());
        }

        for (String nombre : ciudades) {
            System.out.println(String.format("#%d - %s", (ciudades.indexOf(nombre)+1), nombre));
        }

        sc.close();


    }
}
