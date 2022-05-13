package com.example.proyectonuevo.Tablas;

public class Registros {
    int id;
    String tiempo_llegada;
    String tiempo_atencion;
    String cubrebocas;

    public Registros(int id, String tiempo_llegada, String tiempo_atencion) {
        this.id = id;
        this.tiempo_llegada = tiempo_llegada;
        this.tiempo_atencion = tiempo_atencion;
    }

    public Registros(int id, String tiempo_llegada, String tiempo_atencion, String cubrebocas) {
        this.id = id;
        this.tiempo_llegada = tiempo_llegada;
        this.tiempo_atencion = tiempo_atencion;
        this.cubrebocas = cubrebocas;
    }

    public String getCubrebocas() {
        return cubrebocas;
    }

    public void setCubrebocas(String cubrebocas) {
        this.cubrebocas = cubrebocas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTiempo_llegada() {
        return tiempo_llegada;
    }

    public void setTiempo_llegada(String tiempo_llegada) {
        this.tiempo_llegada = tiempo_llegada;
    }

    public String getTiempo_atencion() {
        return tiempo_atencion;
    }

    public void setTiempo_atencion(String tiempo_atencion) {
        this.tiempo_atencion = tiempo_atencion;
    }

    @Override
    public String toString() {
        return "Registros{" +
                "id=" + id +
                ", tiempo_llegada=" + tiempo_llegada +
                ", tiempo_atencion=" + tiempo_atencion +
                '}';
    }
}
