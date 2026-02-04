package com.gmail.albermargar9.Tema8.EjerciciosEntregar.Tren.Maquinaria;

public class Vagon {
    private int id;
    private double cargaMaxima;
    private double cargaActual;
    private String tipoMercancia;

    public Vagon(int id, double cargaMaxima, double cargaActual, String tipoMercancia) {
        this.id = id;
        this.cargaMaxima = cargaMaxima;
        this.cargaActual = cargaActual;
        this.tipoMercancia = tipoMercancia;
    }

    public void cambiarTipoMercancia(String nuevaMercancia) {
        this.tipoMercancia = nuevaMercancia;
    }

    public void aumentarCarga(double cantidad) {
        if (cargaActual + cantidad <= cargaMaxima) {
            this.cargaActual += cantidad;
        } else {
            System.out.println("Error: No se puede superar la carga máxima.");
            this.cargaActual = cargaMaxima;
        }
    }

    public void disminuirCarga(double cantidad) {
        if (cargaActual - cantidad >= 0) {
            this.cargaActual -= cantidad;
        } else {
            this.cargaActual = 0;
        }
    }

    public void mostrarInformacion() {
        System.out.println("   -> Vagón ID: " + id + " | Mercancía: " + tipoMercancia +
                " | Carga: " + cargaActual + "/" + cargaMaxima + "kg");
    }
}
