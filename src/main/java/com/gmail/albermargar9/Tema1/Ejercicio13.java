package com.gmail.albermargar9.Tema1;

import java.util.Scanner;

public class Ejercicio13 {
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
