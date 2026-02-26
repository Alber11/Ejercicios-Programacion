package com.gmail.albermargar9.Tema7_CadenasCaracteres.Ejercicios;

//Diseñar un programa que solicite al usuario una frase y una palabra. A continuación, buscará cuántas veces aparece la palabra en la frase.
//Crea la función
//public static int contarApariciones(String frase, String palabra)
//que recibe una frase y una palabra y devuelve cuántas veces aparece la frase en la
//palabra.

import java.util.Scanner;

public class Ejercicio10 {
    public static int contarApariciones(String frase, String palabra){
        int apariciones = 0;
        int indice = frase.indexOf(palabra);

        while (indice != -1){
            apariciones++;
            indice= frase.indexOf(palabra, indice+palabra.length());
        }
        return apariciones;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("introduce una frase: ");
        String frase = sc.nextLine();

        System.out.println("intrduce una palabra para buscar sus aparaciones:");
        String palabra = sc.nextLine();

        int aparciones = contarApariciones(frase, palabra);

        if (aparciones == 0){
            System.out.println(palabra + " no aparece");
        }else {
            System.out.println("las paraciones de la palabra " + palabra + " son : " + aparciones);
        }
    }
}
