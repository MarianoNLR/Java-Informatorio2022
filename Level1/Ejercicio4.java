package Level1;

import java.util.Scanner;

/*
Realizar un programa que calcule el factorial de un número.
*/
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero entero para calcular el factorial: ");
        int numero = sc.nextInt();

        System.out.println("El factorial de " + numero + " es: " + calcularFactorial(numero));

        sc.close();

    }

    public static int calcularFactorial(int num) {
        return num==1 ? 1 : num * calcularFactorial(num - 1);  
    }
}
