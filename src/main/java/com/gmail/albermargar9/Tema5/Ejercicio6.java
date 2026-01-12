package com.gmail.albermargar9.Tema5;

import java.util.Scanner;

public class Ejercicio6 {
    public static void dibujarRectanguloHueco (int base, int altura, char letra){

        for (int j = 1; j <=base ; j++) {
            System.out.print(letra);
        }
        System.out.println();

        for (int i = 1; i <=altura ; i++) {
            System.out.print(letra);
            for (int j = 1; j <=base-2 ; j++) {
                System.out.print(" ");
            }
            System.out.print(letra);
            System.out.println();
        }
        for (int j = 1; j <=base ; j++) {
            System.out.print(letra);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba la base");
        int base = sc.nextInt();
        System.out.println("Escriba la altura");
        int altura = sc.nextInt();
        System.out.println("Escriba la letra");
        char letra = sc.next().charAt(0);
        dibujarRectanguloHueco(base, altura, letra);
    }
}
