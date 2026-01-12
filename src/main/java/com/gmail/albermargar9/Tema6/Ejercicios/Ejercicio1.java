package com.gmail.albermargar9.Tema6.Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {

    public static void rellenar(int [] tabla, int valor){
        for (int i = 0; i < tabla.length; i++) {
            tabla[i]=valor;
        }
    }
    //podemos rellear la tabla con un for
    public static void rellear2(int [] tabla, int valor){
        Arrays.fill(tabla,valor);
    }
    //podemos rellear la tabla con un fill
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un valor");
        int valor = sc.nextInt();
        int [] tabla = new int[8];
        rellenar(tabla, valor);
        rellear2(tabla,valor);
        System.out.println(Arrays.toString(tabla));
    }
}
