package com.gmail.albermargar9.actividades.actividad13;

import java.util.Scanner;

public class WhilePintar1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digame un numero: ");
        int nAsteriscos = sc.nextInt();
        while (nAsteriscos > 0){
            System.out.print("*");
            nAsteriscos--; //va restando ese numero asi solo hace ese bucle ese numero veces

            // como queremos que imprima el numero de asteriscos que hemos dado y no sabemos
            // cuanto nos va ha pedir el usurario, hacemos que se dentro del while se vaya restando
            // cade vez que se ejecuta para que sea 0 y pueda salir del bucle, por lo tanto solo
            // hace ese bucle el numero de veces solicitadas
        }
    }
}
