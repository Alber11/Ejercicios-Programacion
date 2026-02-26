package com.gmail.albermargar9.Tema7_CadenasCaracteres.Ejercicios;

//Realizar un programa que lea una frase del teclado y nos indique si el palíndroma, es decir, que la frase sea igual leyendo de izquierda a derecha que de derecha a izquierda,
//sin tener en cuenta los espacios. Un ejemplo de frase palíndroma es: “Dábale arroz a la zorra el abad”
//Las vocales con tilde hacen que los algoritmos consideren una frase palíndroma como si no lo fuese. Por eso, supondremos que el usuario introduce la frase sin tildes.
//Idea: puedes crear una función que devuelve una copia de una cadena sin espacios y una función que invierta la cadena.

import java.util.Scanner;

public class Ejercicio13 {
    public static String eliminarEspacios(String cadena){
        String sinEspacios = "";

        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (!Character.isWhitespace(caracter)){
                sinEspacios += caracter;
            }
        }
        return sinEspacios;
    }

    public static String alReves(String cadena){
        String alReves = "";
        for (int i = cadena.length()-1; i > 0 ; i--) {
            alReves += cadena.charAt(i);
        }
        return alReves;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("introduce una frase");
        String frase = sc.nextLine();
        frase = frase.toLowerCase();

        String sinEspacios = eliminarEspacios(frase);
        String inversa = alReves(frase);

        if (sinEspacios.equals(inversa)){
            System.out.println("la frase no es palindroma");
        }else {
            System.out.println("la frase es palindroma");
        }
    }
}
