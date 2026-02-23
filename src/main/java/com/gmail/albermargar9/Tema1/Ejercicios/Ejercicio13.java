package com.gmail.albermargar9.Tema1.Ejercicios;

import java.util.Scanner;

public class Ejercicio13 {

//    Diseñar un programa que indique a una persona si es necesario que corra.
//    Debemos preguntarle si tiene prisa, si está en peligro o si quiere practicar deporte. Si la persona se
//    encuentra en una de estas tres situaciones el programa le indicará que en necesario que corra.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean prisa, peligro, deporte, necesidadCorrer;
        System.out.print("Tienes prisa: ");
        prisa = sc.nextBoolean();
        System.out.print("Estas en peligro: ");
        peligro = sc.nextBoolean();
        System.out.print("Quieres practicar deporte: ");
        deporte = sc.nextBoolean();
        necesidadCorrer = prisa || peligro || deporte;
        System.out.println("Es necesario correr: " + necesidadCorrer);
    }
}
