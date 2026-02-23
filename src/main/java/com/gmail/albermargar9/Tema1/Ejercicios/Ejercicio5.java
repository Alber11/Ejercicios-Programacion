package com.gmail.albermargar9.Tema1.Ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

//    Crear un programa que calcula la media aritmética de dos notas enteras. Hay que
//    tener en cuenta que la media puede contener decimales.


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1, nota2, resultado; //pueden usar decimales
        final int Nnotas;
        System.out.println("calcular media notas");
        System.out.print("Nota 1: ");
        nota1 = sc.nextInt();
        System.out.println("Nota 2: ");
        nota2 = sc.nextInt();
        Nnotas = 2;
        resultado = (nota1 + nota2)/Nnotas;
        System.out.println("la media de las notas es de: " + resultado);

    }
}
