package com.gmail.albermargar9.Tema7_CadenasCaracteres.Ejercicios;

//Diseñar el juego “Acierta la contraseña”.
//La mecánica del juego es la siguiente:
//        • El primer jugador introduce la contraseña.
//        • Luego el juego muestra la longitud por pantalla.
//        • A continuación, el segundo jugador debe teclear palabras hasta que acierte. El
//programa mostrará una cadena con los caracteres acertados en sus lugares
//respectivos y asteriscos en los no acertados para ir dándole pistas al segundo jugador.
//Puede ser de utilidad: String nombreVariable = “” para crear una cadena vacía.

import java.util.Scanner;

public class Ejercicio7 {
    public static String pista(String password, String palabra){
        String pista = "";

        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i)==palabra.charAt(i)){
                pista += palabra.charAt(i);
            }else {
                pista += '*';
            }
        }
        return pista;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Jugador 1, introduce la contraseña: ");
        String password = sc.nextLine();
        System.out.println("la contraseña tiene de longitu: " + password.length());

        System.out.println("jugador 2, introduce la palabra: ");
        String palabra = sc.nextLine();

        while (!password.equals(palabra)){
            System.out.println(pista(password,palabra));
            System.out.println("jugador 2, palabra: ");
            palabra = sc.nextLine();
        }
        System.out.println("Corecto!!");
    }
}
