package EjerciciosComplementariosLevel3;

import java.time.LocalDate;
import java.time.Period;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Se posee una Lista con objetos de clase Alumno con los atributos: apellido,
 * nombre y fechaDeNacimiento (con tipos: String, String y LocalDate). Se desea
 * generar un Map<String, Integer> donde la clave de Map será el apellido
 * concatenado con el nombre (con separador de espacio en blanco) y el value la
 * edad del alumno.
 */

public class Ejercicio5 {
    public static void main(String[] args) {
        List<Alumno> alumnos = List.of(
            new Alumno("Lotero", "Mariano", LocalDate.parse("2001-10-16")),
            new Alumno("Lopez", "Cristian", LocalDate.parse("1997-09-05")),
            new Alumno("Darín", "Ricardo", LocalDate.parse("1957-01-16")));

        Map<String, Integer> alumnosMap = new HashMap<String,Integer>();

        alumnos.stream()
        .forEach(x -> alumnosMap.put(String.format("%s %s", x.getApellido(), x.getNombre()), x.getEdad()));

        System.out.println(alumnosMap);

    }
}

class Alumno{
    private String apellido;
    private String nombre;
    private LocalDate fechaDeNacimiento;


    public Alumno(String apellido, String nombre, LocalDate fechaDeNacimiento) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public Integer getEdad(){

        return Period.between(fechaDeNacimiento, LocalDate.now()).getYears();

    }


    //#region getters y setters

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaDeNacimiento() {
        return this.fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    //#endregion


}
