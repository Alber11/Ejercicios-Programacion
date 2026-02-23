package com.gmail.albermargar9.Tema5_MetodosFunciones;

import java.util.Scanner;

//1. Define una función signo(), que recibirá un número decimal y devolverá un
//número entero con el valor:
//      • -1, si el número es negativo
//      • 1, si el valor es positivo
//      • 0 si el valor es cero.
//2. Crea una función main que solicite un número y pruebe la función
//signo().

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
