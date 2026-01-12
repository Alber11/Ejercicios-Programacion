package com.gmail.albermargar9.Tema5;

import java.util.Scanner;

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
