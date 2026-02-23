package com.gmail.albermargar9.Tema5_MetodosFunciones;

import java.util.Scanner;

public class Ejercicio4 {

//    1. Define una función “dibujarRectangulo” que dibuje un rectángulo, el alto y el
//    ancho los recibirá como parámetros.
//    2. Incluye una función main para solicitar los datos al usuario y probar la función.
//
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
