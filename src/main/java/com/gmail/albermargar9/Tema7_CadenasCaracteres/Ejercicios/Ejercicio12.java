package com.gmail.albermargar9.Tema7_CadenasCaracteres.Ejercicios;

//Introducir por teclado una frase palabra a palabra, y mostrar la frase completa separando las palabras introducidas con espacios en blanco.
//Terminar de leer la frase cuando alguna de las palabras introducidas sean la cadena “fin”,
//escrita con cualquier combinación de mayúsculas y minúsculas. La cadena “fin” no aparecerá en la frase final.

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase = "";

        System.out.println("escribe una palabra");
        String palabra = sc.next();

        while (!palabra.toLowerCase().equals("fin")){
            frase += palabra + " ";
            System.out.println("Escribe otra palabra");
            palabra = sc.next();
        }
        System.out.println(frase);
    }
}
