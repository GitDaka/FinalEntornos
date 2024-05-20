package paquetes;

/**
 *
 * @author Marc
 * @version 1
 * @since 2005202
 *
 */
// Definición de la superclase Participante, de la cual dependen las subclases Asistente y Artista
public class Participante {

    //Definción de variables
    private int codigo;
    private String nombre;

    /**
     * Definición del contructor de la superclase Asistente, se encargará de
     * inicializar los parámetros previamente definidos
     *
     * @param codigo Recibe como parámetro el código y lo asigna a la variable
     * codigo.
     * @param nombre Recibe como parámetro el nombre y lo asigna a la variable
     * nombre.
     */
    public Participante(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    /**
     * @return the codigo of the person
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set the person
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nombre of the person
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
