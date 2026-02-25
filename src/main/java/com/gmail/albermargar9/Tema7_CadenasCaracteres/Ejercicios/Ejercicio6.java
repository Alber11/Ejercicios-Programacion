package com.gmail.albermargar9.Tema7_CadenasCaracteres.Ejercicios;

//Diseñar el juego “Acierta la contraseña”. La mecánica del juego es la siguiente: el
//primer jugador introduce la contraseña; a continuación, el segundo jugador debe
//teclear palabras hasta que acierte. Al segundo jugador se le indicará si la palabra
//introducida es de mayor o menor alfabéticamente que la introducida.

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Jugardor1 introduce la contraseña: ");
        String password = sc.nextLine();

        System.out.println("Jugador2 palabra: ");
        String palabra = sc.nextLine();

        int comparacion = password.compareTo(palabra);

        while (comparacion!=0){
            System.out.println("la contraseña es: " + (comparacion>0?"mayor":"menor") + " que " + palabra);
            System.out.println("Jugador2 palabra:");
            palabra = sc.nextLine();
            comparacion = password.compareTo(palabra);
        }
        System.out.println("Coreecto!!");
    }
}
