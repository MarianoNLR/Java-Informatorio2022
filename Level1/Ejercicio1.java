package Level1;

/**
 * Solicitar por consola el nombre del usuario e imprimir por pantalla el siguiente mensaje “HOLA {USUARIO}!!!”
 */

import java.util.Scanner;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
    
        String nombre = sc.nextLine();

        System.out.println("HOLA " + nombre + "!!!");
        sc.close();
    }
}
