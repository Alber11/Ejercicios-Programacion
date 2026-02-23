package com.gmail.albermargar9.Tema5_MetodosFunciones;

public class Ejercicio2 {

//        1. Define una función llamada “DibujarCuadrado”, que dibuje un cuadrado de lado el valor indicado en el parámetro de entrada.
//        2. Realiza una llamada a la función en el main para probar el programa.

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
