package com.gmail.albermargar9.Tema1;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int primerTrimestre, segundoTrimestre, tercerTrimestre, notaMedia;
        double notaExpediente;
        System.out.println("nota primer trimestre:");
        primerTrimestre = sc.nextInt();
        System.out.println("nota segundo trimestre:");
        segundoTrimestre = sc.nextInt();
        System.out.println("nota tercer trimestre");
        tercerTrimestre = sc.nextInt();
        notaExpediente = (primerTrimestre + segundoTrimestre + tercerTrimestre)/3.0;
        notaMedia = (primerTrimestre + segundoTrimestre + tercerTrimestre)/3;
        System.out.println("Media de expediente: " + notaExpediente);
        System.out.println("Nota media: " + notaMedia);

    }
}
