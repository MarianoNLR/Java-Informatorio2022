package Level1;

import java.util.Scanner;

/**
 * Se desea una aplicación que solicite 2 números enteros y realice la operación de potencia (sin uso de librerías).
*/
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        System.out.print("Ingrese la base: ");
        num1 = sc.nextInt();
        System.out.print("Ingrese el exponente: ");
        num2 = sc.nextInt();

        System.out.println(num1 + " elevado a " + num2 + " = " + potencia(num1, num2));

        sc.close();
    }

    public static int potencia(int num1, int num2){
        int result = 1;

        for (int i = 0; i < num2; i++) {
            result *= num1;
        }
        return result;
    }
}
