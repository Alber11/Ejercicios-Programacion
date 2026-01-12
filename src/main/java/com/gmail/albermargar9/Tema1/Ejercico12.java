package com.gmail.albermargar9.Tema1;

import java.util.Scanner;

public class Ejercico12 {
    public static void main(String[] args) {
        double edad, altura;
        boolean resultado;
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa clacula si una persona puede o no sentarse en el asiento delantero");
        System.out.println("escriba la edad: ");
        edad = sc.nextDouble();
        System.out.println("escriba la alura: ");
        altura = sc.nextDouble();
        resultado = edad >= 12 && altura >= 1.35;
        System.out.println("Puede el niño sentarse en el asinto delantero segun la DGT: " + resultado);
    }
}
