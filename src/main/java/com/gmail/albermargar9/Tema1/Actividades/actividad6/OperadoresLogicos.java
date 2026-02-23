package com.gmail.albermargar9.Tema1.Actividades.actividad6;

import java.util.Scanner;

public class OperadoresLogicos {
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        System.out.println("Hace Sol? (True/False)");
        boolean haceSol = lector.nextBoolean();

        System.out.println("Es fin de semana? (True/False): ");
        boolean esFinDeSemana = lector.hasNextBoolean();
        //se realizan las operaciones logicas
        boolean irALaPlaya = haceSol && esFinDeSemana;
        System.out.println("Puedes ir a la playa: " + irALaPlaya);
    }
}



