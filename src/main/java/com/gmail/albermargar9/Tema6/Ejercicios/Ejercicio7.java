package com.gmail.albermargar9.Tema6.Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        int [] tabla = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < tabla.length; i++) {
            System.out.println("Introduces el valor en la posicion" + i);
            tabla[i]= sc.nextInt();
        }
        System.out.println(Arrays.toString(tabla));
    }
}
