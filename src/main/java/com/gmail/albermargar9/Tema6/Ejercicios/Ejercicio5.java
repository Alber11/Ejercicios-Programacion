package com.gmail.albermargar9.Tema6.Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {
    public static void rellenar(int [] tabla, int valor){
        Arrays.fill(tabla, 5, 15, valor);
    }
    public static void rellenar2(int [] tabla2, int desde, int hasta, int valor){
        for (int i = desde; i < hasta ; i++) {
            tabla2[i]=valor;
        }
    }
    public static void main(String[] args) {
        int [] tabla = new int[20];
        int [] tabla2 = new int[20];
        System.out.println("Introduce el valor");
        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();
        rellenar(tabla, valor);
        rellenar2(tabla2, 5, 15, valor);
        System.out.println(Arrays.toString(tabla));
        System.out.println(Arrays.toString(tabla2));
        
    }
}
