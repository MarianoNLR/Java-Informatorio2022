package Level2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Crear un ArrayList, agregar 5 números enteros. 
 * Luego, agregar un número entero al principio de la lista y otro al final. 
 * Por último, iterar e imprimir los elementos de la lista y 
 * el tamaño de la misma (antes y después de agregar a en la primera y última posición).
 */

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        for (int i = 0; i < 5; i++) {
            System.out.println(String.format("Ingrese el numero %d:", (i+1)));
            numeros.add(sc.nextInt());
        }

        for (Integer num : numeros) {
            System.out.println(num);
        }

        System.out.println("Ingrese un numero entero para agregar al inicio: ");
        numeros.add(0, sc.nextInt());

        System.out.println("Ingrese un numero para agregar al final: ");
        numeros.add(numeros.size(), sc.nextInt());

        for (Integer num : numeros) {
            System.out.println(num);
        }

        sc.close();
    }
}
