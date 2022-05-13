package Level1;

import java.util.Scanner;
/*
Se desea una aplicación que solicite 2 números enteros y realice la operación de multiplicación por sumas sucesivas (sin uso de librerías).
*/ 
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        System.out.print("Ingrese el primer numero: ");
        num1 = sc.nextInt();
        System.out.print("Ingrese el primer numero: ");
        num2 = sc.nextInt();

        System.out.println(num1 + " x " + num2 + " = " + sumaSucesiva(num1, num2));

        sc.close();
    }

    public static int sumaSucesiva(int num1, int num2){
        int result = 0;

        for (int i = 1; i <= num2; i++) {
            result += num1;
        }

        return result;
    }
}
