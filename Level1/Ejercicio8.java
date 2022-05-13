package Level1;

/**
 * Crear una aplicación que solicite de entrada los datos de una persona en este orden:
Nombre y Apellido
Edad
Dirección
Ciudad
Luego imprimirá el siguiente mensaje:
{Ciudad} - {Dirección} - {Edad} - {Nombre y Apellido}
 */

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad;
        String nomApe, direccion, ciudad;
        System.out.println("Ingrese el Nombre y Apellido: ");
        nomApe = sc.nextLine();
        System.out.println("Ingrese la Edad: ");
        edad = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese la Direccion: ");
        direccion = sc.nextLine();
        System.out.println("Ingrese la Ciudad: ");
        ciudad = sc.nextLine();

        Persona p = new Persona(nomApe, edad, direccion, ciudad);
        System.out.println(p.toString()); 
        sc.close();
    }

    
}

class Persona{
    private String NombreApellido;
    private int Edad;
    private String Direccion;
    private String Ciudad;

    public Persona(String nombreApellido, int edad, String direccion, String ciudad){
        this.NombreApellido = nombreApellido;
        this.Edad = edad;
        this.Direccion = direccion;
        this.Ciudad = ciudad;
    }

    @Override
    public String toString() {
        return Ciudad + " - " + Direccion + " - " + Edad + " - " + NombreApellido;
    }
}
