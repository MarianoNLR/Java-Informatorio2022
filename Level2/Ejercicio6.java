package Level2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/**
 * Se dispone de una colección de Empleados, de cada empleado se conoce:
 * ○ Nombre y Apellido
 * ○ DNI
 * ○ horasTrabajadas
 * ○ valorPorHora
 * Todos los empleados están cargados en un Set (HashSet), se desea calcular el
 * sueldo (horasTrabajadas x valorPorHora) de toda esa lista para luego
 * almacenar en un Map (o Diccionario) donde la clave (key) es el dni y 
 * el valor (value) es el sueldo calculado.
 */

public class Ejercicio6 {
    public static void main(String[] args) {
        Map<Integer, Integer> sueldos = new HashMap<>();
        HashSet<Empleado> empleados = new HashSet<Empleado>();


        //Creacion de empleados
        Empleado emp1 = new Empleado("Mariano", "Lotero", 12345678, 
            new ArrayList<>(List.of(6,7,8,4,5)), 
            new ArrayList<>(List.of(350,345,550,600,320)));
        
        Empleado emp2 = new Empleado("Lucas", "Perez", 87654321, 
            new ArrayList<>(List.of(5,4,7,3,6)), 
            new ArrayList<>(List.of(400,450,500,650,300)));
        
        Empleado emp3 = new Empleado("Jorge", "Lopez", 14785236, 
            new ArrayList<>(List.of(8,6,3,5,4)), 
            new ArrayList<>(List.of(500,350,600,325,480)));

        //Agregacion de empleados al Set
        empleados.add(emp1);
        empleados.add(emp2);
        empleados.add(emp3);

        System.out.println("TAMAÑO DEL SET: " + empleados.size());

        //Se agregan los elementos al Map
        for (Empleado empleado : empleados) {
            sueldos.put(empleado.getDNI(), calcularSueldo(empleado));
        }

        //Impresión por pantalla con formato del Map
        for (Map.Entry<Integer, Integer> sueldo: sueldos.entrySet()) {
            System.out.println("DNI: " + sueldo.getKey() + " | Sueldo: $ " + sueldo.getValue());
        }
    }

    //Funcion para calcular el sueldo de un empleado
    public static int calcularSueldo(Empleado empleado){
        int totalSueldo = 0;
            for (int i = 0; i < empleado.getHorasTrabajadas().size(); i++) {
                totalSueldo += empleado.getValorPorHora().get(i) * empleado.getHorasTrabajadas().get(i);
            }
        return totalSueldo;
    }
}

class Empleado{
    private String Nombre;
    private String Apellido;
    private int DNI;
    private ArrayList<Integer> horasTrabajadas = new ArrayList<>();
    private ArrayList<Integer> valorPorHora = new ArrayList<>();


    public Empleado(String Nombre, String Apellido, int DNI, 
                    ArrayList<Integer> horasTrabajadas, 
                    ArrayList<Integer> valorPorHora) {

        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.DNI = DNI;
        this.horasTrabajadas = horasTrabajadas;
        this.valorPorHora = valorPorHora;
    }


    @Override
    public boolean equals(Object o) {
        /*if (o == this)
            return true;*/
        if (!(o instanceof Empleado)) {
            return false;
        }
        Empleado empleado = (Empleado) o;
        return  this.DNI == empleado.DNI;
    }


    @Override
    public int hashCode() {
        return DNI;
    }



    public String getNombre() {
        return this.Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return this.Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getDNI() {
        return this.DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public ArrayList<Integer> getHorasTrabajadas() {
        return this.horasTrabajadas;
    }

    public void setHorasTrabajadas(ArrayList<Integer> horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public ArrayList<Integer> getValorPorHora() {
        return this.valorPorHora;
    }

    public void setValorPorHora(ArrayList<Integer> valorPorHora) {
        this.valorPorHora = valorPorHora;
    }


}
