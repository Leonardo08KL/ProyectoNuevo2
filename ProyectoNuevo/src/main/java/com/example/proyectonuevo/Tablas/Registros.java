package com.example.proyectonuevo.Tablas;

public class Registros {
    Integer id;
    Double tiempo_llegada;
    Double tiempo_atencion;

    public Registros(int id, double tiempo_llegada, double tiempo_atencion) {
        this.id = id;
        this.tiempo_llegada = tiempo_llegada;
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
