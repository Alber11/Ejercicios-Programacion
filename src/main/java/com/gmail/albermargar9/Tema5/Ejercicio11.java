package com.gmail.albermargar9.Tema5;

import java.util.Scanner;

public class Ejercicio11 {
    public static int signo(int numero){
        int signo;
        if (numero < 0){
            signo = -1;
        } else if (numero > 0) {
            signo = 1;
        } else {
            signo = 0;
        }
        return signo;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba un numero");
        int numero = sc.nextInt();
        System.out.println("Signo = " + signo(numero));
    }
}
