package com.gmail.albermargar9.Tema1;

import java.util.Scanner;

public class Ejercicio5 {
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
