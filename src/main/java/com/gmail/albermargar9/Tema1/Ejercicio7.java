package com.gmail.albermargar9.Tema1;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        double numA, numB, numC, resultado, x;
        Scanner sc = new Scanner(System.in);
        System.out.print("escriba un numero: ");
        numA = sc.nextDouble();
        System.out.print("escriba otro numero: ");
        numB = sc.nextDouble();
        System.out.print("escriba otro numero: ");
        numC = sc.nextDouble();
        System.out.print("escriba el coeficiente x: ");
        x   = sc.nextDouble();
        resultado = numA *Math.pow(x,2) + numB * x + numC;
        System.out.println("La operacion a realizar es y= ax2 + bx + c");
        System.out.println("resultado: " + resultado);
    }
}
