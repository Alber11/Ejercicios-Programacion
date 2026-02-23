package com.gmail.albermargar9.Tema1.Actividades.actividad16;

import java.util.Scanner;

public class BucleForPintarCuadrado4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("esciba un numero");
        int numero = sc.nextInt();
        for (int i = 1; i<=numero; i++){
            for (int j = 1; j <=numero; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
