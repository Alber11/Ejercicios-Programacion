package com.gmail.albermargar9.Tema7_CadenasCaracteres.Ejercicios;

//Diseñar la función
//public static String alReves(String cadena)
//que recibe una cadena de caracteres y la devuelve invertida.
//        Un ejemplo, la cadena “Hola mundo” quedaría “odnum aloH”
//Puede ser de utilidad: String nombreVariable = “” para crear una cadena vacía.

import java.util.Scanner;

public class Ejercicio8 {
    public static String alReves(String cadena){
        String inversa = "";
        for (int i = cadena.length()-1; i >= 0 ; i--) {
            inversa+=cadena.charAt(i);
        }
        return inversa;
    }

    public static String alReves2(String cadena){
        String inversa2 = "";
        for (int i = 0; i < cadena.length(); i++) {
            inversa2=cadena.charAt(i)+inversa2;

        }
        return inversa2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe una cadena");
        String original = sc.nextLine();

        String inversa = alReves(original);
        System.out.println(inversa);
    }
}
