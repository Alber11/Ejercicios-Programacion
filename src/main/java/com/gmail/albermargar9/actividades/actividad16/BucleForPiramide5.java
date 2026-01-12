package com.gmail.albermargar9.actividades.actividad16;

import java.util.Scanner;

public class BucleForPiramide5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("escriba un numero impar: ");
        while (!sc.hasNextInt()){
            System.out.println("el numero intrducido es incorrecto");
            sc.next();//limpia la memoria para asi ejecutar de nuevo el while
            System.out.print("introduzca otro numero: ");
        }
        num = sc.nextInt();
        while (num % 2 == 0){
            System.out.println("el numero introducido es par");
            System.out.print("introduzca otro numero: ");
            num = sc.nextInt();
        }
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
                }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
                }
            System.out.println();

        }

    }
}
