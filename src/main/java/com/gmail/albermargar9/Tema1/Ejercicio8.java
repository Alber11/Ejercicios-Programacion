package com.gmail.albermargar9.Tema1;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, resultado;
        System.out.println("escriba un numero entero: ");
        num1 = sc.nextInt();
        System.out.println("escriba otro numero entero: ");
        num2 = sc.nextInt();
        resultado = num1 % num2;
        System.out.println(num1 + " % " + num2 + " = " + resultado);
    }
}
