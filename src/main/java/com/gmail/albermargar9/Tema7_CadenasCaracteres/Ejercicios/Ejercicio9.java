package com.gmail.albermargar9.Tema7_CadenasCaracteres.Ejercicios;

//Escribir un programa que pida el nombre completo al usuario y lo muestre sin vocales (mayúsculas, minúsculas o acentuadas o con diéresis). Por ejemplo, “Álvaro Pérez” se mostrará “lvr Prz”.
//Crea la función public static boolena esVocal(char caracter)
//que recibe un carácter y devuelve true si es vocal o false en caso contrario.
//Crea la función public static String sinVocales(String cadena)
//que recibe una cadena y devuelve una copia de la cadena sin vocales.

import java.util.Scanner;

public class Ejercicio9 {
    public static boolean esVocal(char caracter){
        String vocales = "aeiouáéíúóäëïöü";
        return vocales.indexOf(Character.toLowerCase(caracter))!=-1;
    }

    public static String sinVocales(String cadena){
        String sinVocales = "";
        char caracter;

        for (int i = 0; i < cadena.length(); i++) {
            caracter = cadena.charAt(i);
            if (!esVocal(caracter)){
                sinVocales += caracter;
            }
        }
        return sinVocales;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("escribe una frase");
        String frase = sc.nextLine();

        String fraseSinVocales = sinVocales(frase);
        System.out.println("la frase sin bocales es: " + fraseSinVocales);
    }

}
