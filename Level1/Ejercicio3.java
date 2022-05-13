package Level1;

import java.util.Scanner;
/*
Confeccionar un programa que dado un número entero como dato de entrada imprima la secuencia de números (incrementos de 1)
*/

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero entero: ");
        int valor = sc.nextInt();

        for (int i = 1; i <= valor; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
