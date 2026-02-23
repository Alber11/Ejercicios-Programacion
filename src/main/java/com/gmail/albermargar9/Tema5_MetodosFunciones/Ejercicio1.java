package com.gmail.albermargar9.Tema5_MetodosFunciones;

public class Ejercicio1 {

//1. Define una función llamada “dibujarCuadradro3x3”, que dibuje un cuadrado
//    formado por 3 filas con asteriscos cada una.
//2. Prueba la función realizando una llamada desde el main.

    public  static void dibujarCuadradro3x3(){
        for (int i = 0; i < 3; i++) {
            System.out.println("* * *");
        }
    }

    public static void main(String[] args) {
        dibujarCuadradro3x3();
    }
}
