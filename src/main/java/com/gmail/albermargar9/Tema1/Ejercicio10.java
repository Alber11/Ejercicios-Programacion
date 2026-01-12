package com.gmail.albermargar9.Tema1;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
       int numA, numB;
       boolean resultado;
       Scanner sc = new Scanner(System.in);
       System.out.println("Escriba un numero: ");
       numA = sc.nextInt();
       System.out.println("Escriba otro numero: ");
       numB = sc.nextInt();
       resultado = numA == numB;
       System.out.println("Son iguales: " + resultado);
    }
}
