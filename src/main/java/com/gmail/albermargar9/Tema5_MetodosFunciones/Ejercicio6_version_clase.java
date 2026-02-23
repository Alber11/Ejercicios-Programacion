package com.gmail.albermargar9.Tema5_MetodosFunciones;

import java.util.Scanner;

public class Ejercicio6_version_clase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //hace la verificacion de si el numero intrdocido es correcto
        int base = leeInt("Base:", sc);
        int altura = leeInt("Altura:", sc);
        System.out.println("Letra:");
        char caracter = sc.next().charAt(0);
        System.out.println();
        //impirme a las difentes maneras usadas para hacer el rectangulo hueco
        dibujarRectanguloHueco(base, altura, caracter);
        System.out.println();
        dibujarRectanguloHuecoV2(base, altura, caracter);
        System.out.println();
        dibujarRectanguloHuecoV3(base, altura, caracter);
    }

    private static void dibujarRectanguloHueco(int base, int altura, char caracter) {
        //se usan bucles for
        for (int i = 0; i < base; i++) {
            System.out.print(caracter);
        }
        System.out.println();
        for (int i = 0; i < altura-2; i++) {
            System.out.print(caracter);
            for (int j = 0; j < base -2; j++) {
                System.out.print(" ");
            }
            System.out.println(caracter);
        }
        for (int i = 0; i < base; i++) {
            System.out.print(caracter);
        }
        System.out.println();
    }

    private static void dibujaLineaCaracter(int n, char c) {
        //utiliza el . repat para imprimir n de veces el cracatar de para hacer la base de arriba y abajo
        System.out.print(Character.toString(c).repeat(n));
    }

    private static void dibujarRectanguloHuecoV2(int base, int altura, char caracter) {
        dibujaLineaCaracter(base, caracter);
        //usa con el metodo creado antes mara dibujar la linea de arriba y la de abajo del rectangulo solocitado
        //y con un bucle for imprime los huecos del medio del medio
        System.out.println();
        for (int i = 0; i < altura - 2; i++) {
            System.out.print(caracter);
            dibujaLineaCaracter(base - 2, ' ');
            System.out.println(caracter);
        }
        dibujaLineaCaracter(base, caracter);
        System.out.println();
    }

    private static void dibujarRectanguloHuecoV3(int base, int altura, char caracter) {
        //utliza el repeat dentro del for
        String letra = Character.toString(caracter);
        System.out.println(letra.repeat(base));
        for (int i = 0; i < altura-2; i++) {
            System.out.println(letra + " ".repeat(base - 2) + letra);
        }
        System.out.println(letra.repeat(base));
    }

    private static int leeInt(String s, Scanner sc) {
        //funcion para comprovar si los carater pasado por consola son correctos y que el programa no de error
        System.out.println(s);
        while (!sc.hasNextInt()) {
            System.out.println("Valor introducido no es un entero. Vuelve a introducirlo:");
            sc.next();
        }
        return sc.nextInt();
    }
}
