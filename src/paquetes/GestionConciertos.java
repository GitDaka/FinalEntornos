package paquetes;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Marc
 */
//clase para la gestión de los conciertos
public class GestionConciertos {

    //lista de conciertos
    private ArrayList<Concierto> listaConciertos;
    //lista de participantes
    private ArrayList<Participante> listaParticipantes;

    /**
     * Constructor que se encarga de interactuar con las listas de participantes
     * y conciertos
     */

    public GestionConciertos() {
        this.listaConciertos = new ArrayList<>();
        this.listaParticipantes = new ArrayList<>();
    }

    /**
     * @return the listaConciertos
     */
    public ArrayList<Concierto> getListaConciertos() {
        return listaConciertos;
    }

    /**
     * @param listaConciertos the listaConciertos to set
     */
    public void setListaConciertos(ArrayList<Concierto> listaConciertos) {
        this.listaConciertos = listaConciertos;
    }

    /**
     * @return the listaParticipantes
     */
    public ArrayList<Participante> getListaParticipantes() {
        return listaParticipantes;
    }

    /**
     * @param listaParticipantes the listaParticipantes to set
     */
    public void setListaParticipantes(ArrayList<Participante> listaParticipantes) {
        this.listaParticipantes = listaParticipantes;
    }

    /**
     * Función que se encarga de listar los asistentes, no recibe ni devuelve
     * nungún valor
     */
    public void listarAsistentes() {

    }

    /**
     * Función que se encarga de listar los artistas, no recibe ni devuelve
     * nungún valor
     */
    public void listarArtistas() {

    }

    /**
     * Función que se encarga de listar los conciertos, no recibe ni devuelve
     * nungún valor
     */
    public void listarConciertos() {

    }

    /**
     * Función que se encarga de dar de alta los asistentes, no recibe ni
     * devuelve nungún valor
     */
    public void altaAsistente() {

    }

    /**
     * Función que se encarga de dar de alta los artistas, no recibe ni devuelve
     * nungún valor
     */
    public void altaArtista() {

    }

    /**
     * Función que se encarga de dar de alta un concierto, recibe la siguiente
     * información:
     *
     * @param nombreConcierto Nombre del concierto
     * @param fechaConcierto Fecha del concierto
     * @param codigoArtista El código del artista
     * @param tipoMusica El tipo de música Esta dunción no devuele ningún valor
     */
    public void altaConcierto(String nombreConcierto, LocalDate fechaConcierto, int codigoArtista, String tipoMusica) {

    }

    /**
     * Función que se encarga de listar los conciertos por tipo de mùsica,
     * recibe como parámetro el tipo de música y no retorna ningún valor
     *
     * @param tipoMusica
     */
    public void listarConcertos(String tipoMusica) {

    }

    /**
     * Función que se encarga de agregar un nuevo asistente aun concierto,
     * recibe como parámetros:
     *
     * @param nombreConcierto El nombre del concierto
     * @param codAsistente El código del asistente No retorna ningún valor
     */
    public void nuevoAsistente(String nombreConcierto, int codAsistente) {

    }

    /**
     * Función que se encarga de contar la cantidad de conciertos en los que
     * esta un asistente, recibe:
     *
     * @param codAsistente el cógigo de asistente y no devuelve ningún valor
     */
    public void cantidadConciertos(int codAsistente) {

    }

    /**
     * Función que se encarga de buscar un asistente a través del número de DNI,
     * recibe:
     *
     * @param dni el número de DNI y no devulve ningún valor
     */
    public void buscarAsistente(String dni) {

    }

}
