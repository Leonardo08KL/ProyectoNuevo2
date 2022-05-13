package com.example.proyectonuevo.Tablas;

public class Registros {
    int id;
    double tiempo_llegada;
    double tiempo_atencion;

    public Registros(int id, double tiempo_llegada, double tiempo_atencion) {
        this.id = id;
        this.tiempo_llegada = tiempo_llegada;
        this.tiempo_atencion = tiempo_atencion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTiempo_llegada() {
        return tiempo_llegada;
    }

    public void setTiempo_llegada(double tiempo_llegada) {
        this.tiempo_llegada = tiempo_llegada;
    }

    public double getTiempo_atencion() {
        return tiempo_atencion;
    }

    public void setTiempo_atencion(double tiempo_atencion) {
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
