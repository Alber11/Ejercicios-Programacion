package com.gmail.albermargar9.Tema5;

import java.util.Scanner;

public class Ejercicio13 {
    public static int maximo (int num1, int num2){
        return Math.max(num1, num2);
    }
    public static int maximo (int num1, int num2, int num3){
        int aux = maximo(num1, num2);
        return maximo(aux, num3);
    }
    //estamos sobrecargando las funciones dandole dos usos usando una de esas funciones para que debuelva ota duncion
    public static int minimo (int num1, int num2){
        return Math.min(num1, num2);
    }
    public static int minimo (int num1, int num2, int num3){
        int aux = minimo(num1, num2);
        return minimo(aux, num3);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba un numero");
        int num1 = sc.nextInt();
        System.out.println("Escriba un numero");
        int num2 = sc.nextInt();
        System.out.println("Escriba otro numero");
        int num3 = sc.nextInt();
        System.out.println("maximo =" + maximo(num1, num2, num3));
        System.out.println("minimo =" + minimo(num1, num2, num3));
    }
}
