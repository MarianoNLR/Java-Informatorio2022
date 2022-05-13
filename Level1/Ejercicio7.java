package Level1;

/**
 * Realizar un programa que dado un String de entrada en minúsculas lo convierta por completo a mayúsculas. 
 * Sin uso de métodos o librerías que realicen toUppercase().
 */

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra = sc.nextLine();
        String palabraMayus = "";

        for (int i = 0; i < palabra.length(); i++) {
            char aux = palabra.charAt(i);
            if(aux >= 97 && aux <= 122)
                palabraMayus += (char)((aux-32));
        }

        System.out.println(palabraMayus);
        sc.close();
    }
}
