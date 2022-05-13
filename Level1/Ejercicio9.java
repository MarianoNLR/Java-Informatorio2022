package Level1;

import java.util.Scanner;

/**
 * Dado un String de entrada (frase, texto, etc) calcular la cantidad de veces que aparece una letra dada.
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 0;
        System.out.println("Ingrese una frase, texto, etc: ");
        String texto = sc.nextLine();
        System.out.println("Ingrese la letra a contar: ");
        char letra = sc.next().charAt(0);

        for (int i = 0; i < texto.length(); i++) {
            if(texto.charAt(i) == letra) cont++;
        }

        System.out.println(cont);
        sc.close();
    }
}
