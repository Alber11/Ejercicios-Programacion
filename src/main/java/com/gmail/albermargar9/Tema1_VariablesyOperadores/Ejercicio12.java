package com.gmail.albermargar9.Tema1_VariablesyOperadores;

import java.util.Scanner;

public class Ejercicio12 {

//    Diseñar un programa que nos indique si una persona puede sentarse en el asiento delantero de un coche
//    según la DGT. El programa deberá solicitar la edad y la altura. El programa mostrará que si se puede
//    sentar en el asiento delantero cuando la edad sea mayor o igual a 12 y la altura mayor o igual a 1,35.

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
