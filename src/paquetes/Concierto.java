package paquetes;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Marc
 */
public class Concierto {
    //Defición de las variables
    private String nomConcierto;
    private LocalDate fechaConcierto;
    //objeto tipo artista
    private Artista artistaobj;
    private String tipoMusica;
    //lista de asistentes
    private ArrayList<Asistente> listaAsistentes;

    /**
     *Definición del contructor para la clase concerto 
     * @param nomConcierto Recibe como parámetro el nombre del concierto y lo asigna a la variable nomConcierto
     * @param fechaConcierto Recibe como parámetro la fecha del concierto y lo asigna a la variable fechaConcierto
     * @param artistaobj Recibe como parámetro la información de tipo objeto del artista
     * @param tipoMusica Recibe como parámetroel tipo de musica del concerto
     */

    public Concierto(String nomConcierto, LocalDate fechaConcierto, Artista artistaobj, String tipoMusica) {
        this.nomConcierto = nomConcierto;
        this.fechaConcierto = fechaConcierto;

        this.listaAsistentes = new ArrayList<>();
    }

    /**
     * @return the nomConcierto
     */
    public String getNomConcierto() {
        return nomConcierto;
    }

    /**
     * @param nomConcierto the nomConcierto to set
     */
    public void setNomConcierto(String nomConcierto) {
        this.nomConcierto = nomConcierto;
    }

    /**
     * @return the fechaConcierto
     */
    public LocalDate getFechaConcierto() {
        return fechaConcierto;
    }

    /**
     * @param fechaConcierto the fechaConcierto to set
     */
    public void setFechaConcierto(LocalDate fechaConcierto) {
        this.fechaConcierto = fechaConcierto;
    }

    /**
     * @return the artistaobj
     */
    public Artista getArtistaobj() {
        return artistaobj;
    }

    /**
     * @param artistaobj the artistaobj to set
     */
    public void setArtistaobj(Artista artistaobj) {
        this.artistaobj = artistaobj;
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
     * @return the listaAsistentes
     */
    public ArrayList<Asistente> getListaAsistentes() {
        return listaAsistentes;
    }

    /**
     * @param listaAsistentes the listaAsistentes to set
     */
    public void setListaAsistentes(ArrayList<Asistente> listaAsistentes) {
        this.listaAsistentes = listaAsistentes;
    }

}
