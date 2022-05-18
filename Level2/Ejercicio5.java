package Level2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Dados 2 ArrayList que contienen horas-trabajadas (array1) y valor-por-hora(array2) 
 * del resumen de carga de horas semanal de un empleado. 
 * Se debe generar otra lista que contenga los totales y 
 * luego imprimir el total final a cobrar.
 */

public class Ejercicio5 {

    public enum DiasSemana{Lunes, Martes, Miercoles, Jueves, Viernes}
    public static void main(String[] args) {
        
        ArrayList<Integer> horasTrabajadas = new ArrayList<>();
        ArrayList<Integer> valorHora = new ArrayList<>();
        ArrayList<Integer> totalCobro = new ArrayList<>();
        int totalFinal = 0;
        cargarHoras(horasTrabajadas);
        cargarValorHora(valorHora);
        calcularTotal(totalCobro, horasTrabajadas, valorHora);
        System.out.println(totalCobro);
        totalFinal = getTotalFinal(totalCobro);
        System.out.println("Total final: $ " + totalFinal);
        
    }

    public static void cargarHoras(ArrayList<Integer> horasTrabajadas){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < DiasSemana.values().length; i++) {
            System.out.println(String.format("Ingrese horas trabajadas el %s: ", DiasSemana.values()[i]));
            horasTrabajadas.add(sc.nextInt());
        }
    }

    public static void cargarValorHora(ArrayList<Integer> valorHora){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < DiasSemana.values().length; i++) {
            System.out.println(String.format("Ingrese valor por hora del %s: ", DiasSemana.values()[i]));
            valorHora.add(sc.nextInt());
        }
        sc.close();
    }

    public static void calcularTotal(ArrayList<Integer> totalCobro, ArrayList<Integer> horasTrabajadas, ArrayList<Integer> valorHora ){
        for (int i = 0; i < DiasSemana.values().length; i++) {
            int totalDia = horasTrabajadas.get(i) * valorHora.get(i);
            totalCobro.add(totalDia);
        }
    }

    public static int getTotalFinal(ArrayList<Integer> totalCobro){
        int total = 0;

        for (Integer cobro : totalCobro) {
            total +=cobro;
        }

        return total;
    }
}
