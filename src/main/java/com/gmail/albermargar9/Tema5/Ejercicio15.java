package com.gmail.albermargar9.Tema5;

import java.util.Scanner;

public class Ejercicio15 {
    public static double potenciaRecursiva (double base, int exponente){
        double resultado;
        if (exponente==0){
            resultado = 1;
        }else {
            resultado = base * potenciaRecursiva(base, exponente-1);
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
