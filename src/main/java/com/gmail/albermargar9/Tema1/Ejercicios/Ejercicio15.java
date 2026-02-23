package com.gmail.albermargar9.Tema1.Ejercicios;

import java.util.Scanner;

public class Ejercicio15 {

//    Partiendo de las condiciones del ejercicio 10, incluir que existe una opción en la que, indistintamente de
//    si está lloviendo o haber terminado la tarea, podremos salir a la calle: cuando tengamos que ir a la
//    biblioteca.
//    En este caso, también debemos pedir al usuario que nos indique si necesita ir a la biblioteca. El
//    algoritmo debe mostrar mediante un booleano (true o false) si es posible que se otorgue permiso para
//    salir a la calle.

    public static void main(String[] args) {
        boolean lloviendo, tareas, bilioteca, salir;
        Scanner sc = new Scanner(System.in);
        System.out.println("esta lloviendo?");
        lloviendo = sc.nextBoolean();
        System.out.println("hay tarea que realizar?");
        tareas = sc.nextBoolean();
        System.out.println("Necesita ir a la biblioteca?");
        bilioteca = sc.nextBoolean();
        salir = !lloviendo && !tareas || bilioteca;
        System.out.println("Podemos salir: " + salir);
    }
}
