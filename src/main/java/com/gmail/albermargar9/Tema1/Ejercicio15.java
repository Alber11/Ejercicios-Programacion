package com.gmail.albermargar9.Tema1;

import java.util.Scanner;

public class Ejercicio15 {
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
