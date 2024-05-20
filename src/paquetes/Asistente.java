package paquetes;

import java.time.LocalDate;

/**
 *
 * @author Marc
 * @version 1.0
 */
//Clase Asistente,heredada de la superclase Participante
public class Asistente extends Participante {

    //Definción de variables
    private String dni;
    private LocalDate fechaNacimiento;

    /**
     * Definición del constructor de la función Aistente, se encargará de
     * inicializar los parámetros definidos
     *
     * @param codigo recibe el código de la superclase (Participante) y se
     * inicializa
     * @param nombre recibe el nombre de la superclase (Participante) y se
     * inicializa
     * @param dni establece el valor de la variable dni recibido como parámetro
     * @param fechaNacimiento establece la fecha de nacimiento de la persona
     * recibido como parámetro
     */
    public Asistente(int codigo, String nombre, String dni, LocalDate fechaNacimiento) {
        super(codigo, nombre);
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;

    }

    /**
     * @return the dni of the person
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return the fechaNacimiento
     */
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * @param fechaNacimiento the fechaNacimiento to set
     */
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

}
