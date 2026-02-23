package com.gmail.albermargar9.Tema5_MetodosFunciones;

import java.util.Scanner;

//1. Define una función que recibe como parámetros dos números enteros y
//devuelva el máximo entre ambos.
//2. Define una función que recibe como parámetros dos números enteros y
//devuelva el mínimo entre ambos.
//3. Crea un main que solicite al usuario dos números e invoques a las funciones
//para calcular el máximo y el mínimo


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
