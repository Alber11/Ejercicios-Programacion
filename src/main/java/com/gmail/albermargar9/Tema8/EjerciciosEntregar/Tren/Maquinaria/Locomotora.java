package com.gmail.albermargar9.Tema8.EjerciciosEntregar.Tren.Maquinaria;

import com.gmail.albermargar9.Tema8.EjerciciosEntregar.Tren.Personal.Mecanico;

public class Locomotora {
    private String matricula;
    private int potencia;
    private int anoFabricacion;
    private Mecanico mecanico;

    public Locomotora(String matricula, int potencia, int anoFabricacion, Mecanico mecanico) {
        this.matricula = matricula;
        this.potencia = potencia;
        this.anoFabricacion = anoFabricacion;
        this.mecanico = mecanico;
    }

    public void cambiarMecanico(Mecanico nuevoMecanico) {
        this.mecanico = nuevoMecanico;
    }

    public void mostrarInformacion() {
        System.out.println("--- Locomotora ---");
        System.out.println("Matrícula: " + matricula);
        System.out.println("Potencia: " + potencia + "CV");
        System.out.println("Año: " + anoFabricacion);
        System.out.print("Mecánico Encargado: ");
        if(mecanico != null) mecanico.mostrarInformacion();
        System.out.println("------------------");
    }
}
