package com.gmail.albermargar9.Tema7_CadenasCaracteres.Ejercicios;

//Introducir por teclado dos frases e indica cuál de ellas es la más corta, es decir, la que contiene menos caracteres.
//Para leer un String se utiliza sc.nextLine()

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce la primera frase");
        String frase1 = scanner.nextLine();
        System.out.println("introduce la segunda frase");
        String frase2 = scanner.nextLine();

        int longitudFrase1 = frase1.length();
        int longitudFrase2 = frase2.length();

        if (longitudFrase1==longitudFrase2){
            System.out.println("la longitud son iguales");
        } else if (longitudFrase1 < longitudFrase2) {
            System.out.println("la frase 1 es menor " + longitudFrase1 + " que la frase 2: " + longitudFrase2);
        } else if (longitudFrase1 > longitudFrase2) {
            System.out.println("la frase 1 es mayor " + longitudFrase1 + " que la frase 2: " + longitudFrase2);
        }
    }
}
