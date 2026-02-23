package com.gmail.albermargar9.Tema6_Arrays.Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

//Realiza un programa que rellene los 8 elementos enteros de una tabla con un valor
//solicitado al usuario. Después muestra el contenido de la tabla por pantalla.
//Transforma el código en una función:
//public static void rellenar(int tabla, int valor)
//E invoca a la función en el main.

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
