package com.gmail.albermargar9.Tema1.Ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

//    Dado el siguiente polinomio de segundo grado: y= 𝑎𝑥2 + 𝑏𝑥 + c
//    Crea un programa que pida los coeficientes a, b y c, así como el valor de x, y después
//    calcule el valor correspondiente de y.

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
