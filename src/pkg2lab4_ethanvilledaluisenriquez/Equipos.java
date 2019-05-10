package pkg2lab4_ethanvilledaluisenriquez;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;

public class Equipos 
{
    private String nombre;
    private String estadio;
    private String país; 
    private String n_entrenador;
    private String n_dueño;
    private String n_mascota;
    private Date fecha_creación;
    private String color_p;
    private ArrayList<Jugadores> lista=new ArrayList();
    private int contPat = 0;
    private int contTir = 0;

    public Equipos() {
    }

    public Equipos(String nombre, String estadio, String país, String n_entrenador, String n_dueño, String n_mascota, Date fecha_creación, String color_p) {
        this.nombre = nombre;
        this.estadio = estadio;
        this.país = país;
        this.n_entrenador = n_entrenador;
        this.n_dueño = n_dueño;
        this.n_mascota = n_mascota;
        this.fecha_creación = fecha_creación;
        this.color_p = color_p;
    }

    public void addPat () {
        contPat++;
    }
    
    public void addTir () {
        contTir++;
    }
    
    public int getPat() {
        return contPat;
    }
    
    public int getTir() {
        return contTir;
    }
    
    public ArrayList getLista(){
        return lista;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public String getPaís() {
        return país;
    }

    public void setPaís(String país) {
        this.país = país;
    }

    public String getN_entrenador() {
        return n_entrenador;
    }

    public void setN_entrenador(String n_entrenador) {
        this.n_entrenador = n_entrenador;
    }

    public String getN_dueño() {
        return n_dueño;
    }

    public void setN_dueño(String n_dueño) {
        this.n_dueño = n_dueño;
    }

    public String getN_mascota() {
        return n_mascota;
    }

    public void setN_mascota(String n_mascota) {
        this.n_mascota = n_mascota;
    }

    public Date getFecha_creación() {
        return fecha_creación;
    }

    public void setFecha_creación(Date fecha_creación) {
        this.fecha_creación = fecha_creación;
    }

    public String getColor_p() {
        return color_p;
    }

    public void setColor_p(String color_p) {
        this.color_p = color_p;
    }

    @Override
    public String toString() {
        return "Equipos{" + "nombre=" + nombre + ", estadio=" + estadio + ", pa\u00eds=" + país + ", n_entrenador=" + n_entrenador + ", n_due\u00f1o=" + n_dueño + ", n_mascota=" + n_mascota + ", fecha_creaci\u00f3n=" + fecha_creación + ", color_p=" + color_p + '}';
    }
    
    
}
