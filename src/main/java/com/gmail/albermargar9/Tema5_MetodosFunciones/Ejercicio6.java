package com.gmail.albermargar9.Tema5_MetodosFunciones;

import java.util.Scanner;

public class Ejercicio6 {

//    1. Define una función “dibujarRectanguloHueco" que dibuje en pantalla un rectángulo hueco del ancho y
//    alto recibidos como parámetros, formado por una letra que también se reciba como parámetro.
//    2. En el main, solicita los datos al usuario e invoca a la función para dibujar el rectángulo.
//    Ejemplos de ejecución:
//    Base:5
//    Altura:6
//    Letra:a
//    aaaaa
//    a   a
//    a   a
//    a   a
//    a   a
//    aaaaa

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
