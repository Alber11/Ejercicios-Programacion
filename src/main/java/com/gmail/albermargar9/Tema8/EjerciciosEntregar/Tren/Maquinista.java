package com.gmail.albermargar9.Tema8.EjerciciosEntregar.Tren;

public class Maquinista {
    private String nombre;
    private String dni;
    private double sueldo;
    private String rango;

    public Maquinista(String nombre, String dni, double sueldo, String rango) {
        this.nombre = nombre;
        this.dni = dni;
        this.sueldo = sueldo;
        this.rango = rango;
    }

    public void aumentarSueldo(double cantidad) {
        this.sueldo += cantidad;
    }

    public void reducirSueldo(double cantidad) {
        this.sueldo -= cantidad;
    }

    public void cambiarRango(String nuevoRango) {
        this.rango = nuevoRango;
    }

    public void mostrarInformacion() {
        System.out.println("--- Maquinista ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Sueldo: " + sueldo);
        System.out.println("Rango: " + rango);
        System.out.println("------------------");
    }
}
