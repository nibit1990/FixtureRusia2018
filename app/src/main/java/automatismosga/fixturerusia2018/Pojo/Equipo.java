package automatismosga.fixturerusia2018.Pojo;

import java.util.ArrayList;
import java.util.List;

import automatismosga.fixturerusia2018.R;

/**
 * Created by Gus on 29/11/2016.
 */
public class Equipo {


    private int bandera;
    private String nombre;
    private int puntos;

    public Equipo(int bandera, String nombre, int resultado) {
        this.bandera = bandera;
        this.nombre = nombre;
        this.puntos = resultado;
    }

    public void setBandera(int bandera) {
        this.bandera = bandera;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public int getBandera() {
        return bandera;
    }



}


