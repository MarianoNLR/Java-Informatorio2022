package Level2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        System.out.print("Ingrese el primero número: ");
        num1 = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        num2 = sc.nextInt();

        while (num2<num1) {
            System.out.println("El segundo número no puede menor al primero!!");
            System.out.println("Ingrese el segundo numero: ");
            num2 = sc.nextInt();
        }

        ArrayList<String> result = fizzBuzz(num1, num2);

        System.out.println(result);

        sc.close();

    }

    public static ArrayList<String> fizzBuzz(int num1, int num2){
        ArrayList<String> arr = new ArrayList<>();

        for (Integer i = num1; i < num2; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                arr.add("FizzBuzz");
            }
            else if (i % 2 == 0) {
                arr.add("Fizz");
            }
            else if (i % 3 == 0) {
                arr.add("Buzz");
            }
            else {
                arr.add(i.toString());
            }
        }

        return arr;
    }
}
