package com.gmail.albermargar9.Tema1.Ejercicios;

import java.util.Scanner;

public class Ejercicio19 {

//    Escribe un programa que solicite las notas del primer, segundo y tercer trimestres (notas enteras que se
//    solicitarán al usuario).
//    El programa debe mostrar la nota media como se registra en el expediente, es decir, la media con
//    decimales; y la nota media como se muestra en el boletín de calificaciones, es decir, solo la parte
//    entera de la media del expediente (utiliza un cast en este caso).
//    Ejemplo ejecución:
//    Nota primer trimestre: 9
//    Nota segundo trimestre: 9
//    Nota tercer trimestre: 10
//    Expediente académico: 9,33
//    Boletín de calificaciones: 9

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
