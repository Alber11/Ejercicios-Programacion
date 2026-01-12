package com.gmail.albermargar9.Tema6.Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        int sice;
        int contadorCeros = 0;
        int sumaPositivos = 0;
        int sumaNegativos = 0;
        int contadorPositivos = 0;
        int contadorNegativos = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("que tamaño quieres que tenga el array");
        sice = sc.nextInt();
        int [] tabla = new int[sice];
        System.out.println("que valosres quieres que tenga el array");
        for (int i = 0; i < tabla.length; i++) {
            System.out.println("Introduce valores en la poscion" + i);
            tabla[i] = sc.nextInt();
        }
        System.out.println("la tabla resulatante es: " + Arrays.toString(tabla));
        for (int numeros : tabla){
            if (numeros==0){
                contadorCeros ++;
            } else if (numeros>0) {
                sumaPositivos += numeros;
                contadorPositivos ++;
            } else {
                sumaNegativos += numeros;
                contadorNegativos++;
            }
        }
        double mediaPositivos = sumaPositivos/contadorPositivos;
        double mediaNegativos = sumaNegativos/contadorNegativos;
        System.out.println("la media de los numeros positivos: " + mediaPositivos);
        System.out.println("la media de los numeros negativos: " + mediaNegativos);
        System.out.println("cantidad de ceros: " + contadorCeros);
    }
}
