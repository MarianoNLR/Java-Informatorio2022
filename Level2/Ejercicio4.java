package Level2;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Cargar un arrayList con 12 nombres de estudiantes (String), luego separarlos 
 * en 3 cursos (3 arrayList) e imprimir dichos cursos.
 */

public class Ejercicio4 {
    public static void main(String[] args) {
        ArrayList<String> alumnos = new ArrayList<String>();
        List<String> curso1 = new ArrayList<String>();
        List<String> curso2 = new ArrayList<String>();
        List<String> curso3 = new ArrayList<String>();
        cargarAlumnos(alumnos);
        curso1 = alumnos.subList(0, 4);
        curso2 = alumnos.subList(4, 8);
        curso3 = alumnos.subList(8, 12);

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(curso3);

    }

    public static void cargarAlumnos(ArrayList<String> alumnos) {
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 12; i++) {
            System.out.println(String.format("Nombre del alumno %d: ", (i+1)));
            alumnos.add(sc.nextLine());
        }

        sc.close();
    }

}
