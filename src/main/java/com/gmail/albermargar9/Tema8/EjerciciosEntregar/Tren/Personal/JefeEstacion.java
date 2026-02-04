package com.gmail.albermargar9.Tema8.EjerciciosEntregar.Tren.Personal;

import java.time.LocalDate;

public class JefeEstacion {
    private String nombre;
    private String dni;
    private LocalDate fechaNombramiento;

    public JefeEstacion(String nombre, String dni, LocalDate fechaNombramiento) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNombramiento = fechaNombramiento;
    }

    public void mostrarInformacion() {
        System.out.println("--- Jefe de Estación ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Fecha Nombramiento: " + fechaNombramiento);
        System.out.println("------------------------");
    }
}
