package com.gmail.albermargar9.Tema5;

public class Ejercicio2 {
    public static void DibujarCuadrado(int dimension){
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        DibujarCuadrado(5);
    }
}
