package com.gmail.albermargar9.Tema5_MetodosFunciones;

import java.util.Scanner;

//1. Implementa la función
//static double distancia (double x1, double y1, double x2, double y2)
//que calcula la distancia euclídea que separa los puntos (x1, y1) y (x2, y2).
//La fórmula para calcular esta distancia es:
//2. Solicita en el main las coordenadas de los dos puntos
//al usuario e invoca a la función distancia
//para calcularla

public class Ejercicio9 {
    static double distancia (double x1, double y1, double x2, double y2){
        return Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("primer punto");
        System.out.println("Escriba el valor de x1");
        double x1 = sc.nextDouble();
        System.out.println("Escriba el valor de y1");
        double y1 = sc.nextDouble();
        System.out.println("segundo punto");
        System.out.println("Escriba el valor de x2");
        double x2 = sc.nextDouble();
        System.out.println("Escriba el valor de y2");
        double y2 = sc.nextDouble();
        System.out.println("La distanacia es de ecluidea es: " + distancia(x1,y1,x2,y2));
    }
}
