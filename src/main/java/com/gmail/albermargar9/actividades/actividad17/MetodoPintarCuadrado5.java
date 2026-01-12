package com.gmail.albermargar9.actividades.actividad17;

import java.util.Scanner;

public class MetodoPintarCuadrado5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("dame la altura: ");
        while (!sc.hasNextInt()){
            System.out.println("el numero introducido es incorrecto");
            sc.next();
            System.out.print("introduzca otra altura: ");
        }
        int altura = sc.nextInt();
        System.out.print("dame la anchura: ");
        while (!sc.hasNextInt()){
            System.out.println("el numero introducido es incorrecto");
            sc.next();
            System.out.print("introduce otra anchura: ");
        }
        int anchura = sc.nextInt();
        pintarCuadrado(altura,anchura,"Mi cuadrado es: ");
    }

    public static void pintarCuadrado (int altura, int anchura, String titulo){
        System.out.println(titulo + altura + " x " + anchura);
        for (int i = 0; i< altura; i++){
            for (int l = 0; l< anchura; l++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
