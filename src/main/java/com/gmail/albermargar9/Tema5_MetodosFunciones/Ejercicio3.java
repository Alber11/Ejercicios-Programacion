package com.gmail.albermargar9.Tema5_MetodosFunciones;

import java.util.Scanner;

public class Ejercicio3 {

//    1. Define una función “eco” a la se le pasa como parámetro un número n
//    introducido por el usuario, y muestra por pantalla n veces el mensaje “Eco…”
//
//    2. Realiza una llamada a la función desde el main para probarla.
//
    public static void eco (int n){
        for (int i = 0; i < n; i++) {
            System.out.println("Eco");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("cuantos eco quieres");
        int n = sc.nextInt();
        eco(n);
    }
}
