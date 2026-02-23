package com.gmail.albermargar9.Tema1_VariablesyOperadores;

import java.util.Scanner;

public class Ejercicio14 {

//    Diseñar un programa que nos indique si podemos salir a la calle. La decisión de salir se toma en función
//    de si está lloviendo y de si hemos terminado nuestras tareas.
//    Solo podremos salir a la calle si no está lloviendo y hemos finalizado nuestras tareas.
//    Solicitar al usuario (mediante un booleano) si llueve y si ha finalizado la tarea. El algoritmo debe
//    mostrar mediante un booleano (true o false) si es posible que se otorgue permiso para salir a la calle.
//
    public static void main(String[] args) {
        boolean lloviendo, tareas, salir;
        Scanner sc = new Scanner(System.in);
        System.out.println("esta lloviendo?");
        lloviendo = sc.nextBoolean();
        System.out.println("hay tarea que realizar?");
        tareas = sc.nextBoolean();
        salir = !lloviendo && tareas;
        System.out.println("Podemos salir: " + salir);
    }
}
