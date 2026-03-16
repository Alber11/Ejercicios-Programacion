package com.gmail.albermargar9.Tema8_Clases.EjerciciosEntregar.Tren.Personal;

import java.util.Arrays;

public class Mecanico {
    private String nombre;
    private String dni;
    private String telefono;
    private String[] especialidades;

    public Mecanico(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.especialidades = new String[0];
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void incluirOtraEspecialidad(String especialidad) {
        String[] nuevaLista = Arrays.copyOf(especialidades, especialidades.length + 1);
        nuevaLista[nuevaLista.length - 1] = especialidad;
        this.especialidades = nuevaLista;
    }

    public void mostrarInformacion() {
        System.out.println("--- Mecánico ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Teléfono: " + (telefono != null ? telefono : "No asignado"));
        System.out.println("Especialidades: " + Arrays.toString(especialidades));
        System.out.println("----------------");
    }
}
