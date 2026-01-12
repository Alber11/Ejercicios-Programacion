package com.gmail.albermargar9.Tema6.Ejercicios;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        int sice;
        Scanner sc = new Scanner(System.in);
        System.out.println("que tamaño quieres que tenga la tabla: ");
        sice = sc.nextInt();
        int [] tabla = new int[sice];
        for (int i = 0; i < sice; i++) {
            System.out.println("introduce el numero de la posicion: " + i);
            tabla[i] = sc.nextInt();
        }
        System.out.println("los numeros introducidios a la inversa: ");
        //bucle for para mostrar una tabla a la inversa
        for (int i = tabla.length -1; i >= 0; i--) {
            System.out.print(tabla[i] + " ");
        }
    }
}
