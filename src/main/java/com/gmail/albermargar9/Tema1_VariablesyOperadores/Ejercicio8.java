package com.gmail.albermargar9.Tema1_VariablesyOperadores;

import java.util.Scanner;

public class Ejercicio8 {

//    Crear un programa que solicite dos números enteros y calcule cuánto es el primero
//    módulo el segundo. Muestra el resultado por pantalla.
//    Ejemplo de salida esperada:
//    Introduzca un número:
//            7
//    Introduzca otro número:
//            3
//            7 % 3 = 1

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
