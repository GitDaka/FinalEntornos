package paquetes;

/**
 *
 * @author Marc
 * @version 1.0
 */
//Clase Artista,heredada de la superclase Participante
public class Artista extends Participante {

    //Definici{on de las variables
    private int numIntegrantes;
    private String tipoMusica;
    private double precio;

    /**
     * Definición del constructor de la clase Artista
     *
     * @param codigo recibe el código de la superclase (Participante) y se
     * inicializa
     * @param nombre recibe el nombre de la superclase (Participante) y se
     * inicializa
     * @param numIntegrantes establece el número de integrantes del grupo
     * musical recibido como parámetro
     * @param tipoMusica establece el tipo de musica de la agrupación musical
     * @param precio establece el precio
     */
    public Artista(int codigo, String nombre, int numIntegrantes, String tipoMusica, double precio) {
        super(codigo, nombre);
        this.numIntegrantes = numIntegrantes;
        this.tipoMusica = tipoMusica;
        this.precio = precio;
    }

    /**
     * @return the numIntegrantes
     */
    public int getNumIntegrantes() {
        return numIntegrantes;
    }

    /**
     * @param numIntegrantes the numIntegrantes to set
     */
    public void setNumIntegrantes(int numIntegrantes) {
        this.numIntegrantes = numIntegrantes;
    }

    /**
     * @return the tipoMusica
     */
    public String getTipoMusica() {
        return tipoMusica;
    }

    /**
     * @param tipoMusica the tipoMusica to set
     */
    public void setTipoMusica(String tipoMusica) {
        this.tipoMusica = tipoMusica;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
