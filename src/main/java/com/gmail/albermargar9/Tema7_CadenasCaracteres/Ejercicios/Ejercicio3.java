package com.gmail.albermargar9.Tema7_CadenasCaracteres.Ejercicios;

//Diseñar una función
//public static int cantidadEspacios(String cadena)
//que indique cuántos espacios en blanco tiene una cadena pasada como
//parámetro.
//Crea un main para probar la función.

import java.util.Scanner;

public class Ejercicio3 {
    public static int cantidadEspacios(String cadena){
        int espacios = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (Character.isSpaceChar(cadena.charAt(i))){
                espacios++;
            }
        }
        return espacios;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;

        System.out.println("escriba la frase");
        frase = sc.nextLine();
        System.out.println("contiene estos espacios: " + cantidadEspacios(frase));
    }
}
