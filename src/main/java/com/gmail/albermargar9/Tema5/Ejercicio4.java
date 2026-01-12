package com.gmail.albermargar9.Tema5;

import java.util.Scanner;

public class Ejercicio4 {
    public static void dibujarRectangulo(int ancho, int alto){
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ancho del rectangulo");
        int ancho = sc.nextInt();
        System.out.println("Alto dele rectangulo");
        int alto = sc.nextInt();
        dibujarRectangulo(ancho, alto);
    }
}
