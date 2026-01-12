package com.gmail.albermargar9.Tema1;

import java.util.Scanner;

public class Ejercicio14 {
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
