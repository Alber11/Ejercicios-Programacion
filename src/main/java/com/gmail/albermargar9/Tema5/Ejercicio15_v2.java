package com.gmail.albermargar9.Tema5;

import java.util.Scanner;

public class Ejercicio15_v2 {
    public static double potenciaRecursiva(double base, int exponente){
        double resultado = 1;
        for (int i = 1; i <= exponente ; i++) {
            resultado*=base;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba la base");
        double base = sc.nextDouble();
        System.out.println("Escriba el expoente");
        int expoenete = sc.nextInt();
        double resultado = potenciaRecursiva(base, expoenete);
        System.out.println(base + "^" + expoenete + "=" + resultado);
    }
}
