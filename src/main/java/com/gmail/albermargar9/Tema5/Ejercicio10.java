package com.gmail.albermargar9.Tema5;

import java.util.Scanner;

public class Ejercicio10 {
    public static boolean esVocal(char caracter){
        return caracter == 'a' || caracter == 'A' ||
                caracter == 'e' || caracter == 'E' ||
                caracter == 'i' || caracter == 'I' ||
                caracter == 'o' || caracter == 'O' ||
                caracter == 'u' || caracter == 'U';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("escribe un caracter");
        char carcater = sc.next().charAt(0);
        System.out.println(esVocal(carcater));
    }
}
