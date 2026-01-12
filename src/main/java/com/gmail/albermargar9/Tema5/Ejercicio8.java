package com.gmail.albermargar9.Tema5;

import java.util.Scanner;

public class Ejercicio8 {
    public static int maximo (int num1, int num2){
        return Math.max(num1, num2);
    }
    public static int minimo (int num1, int num2){
        return Math.min(num1, num2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba un numero");
        int num1 = sc.nextInt();
        System.out.println("Escriba un numero");
        int num2 = sc.nextInt();
        System.out.println("el maximo es: " + maximo(num1, num2));
        System.out.println("el minimo es: " + minimo(num1, num2));
    }

}
