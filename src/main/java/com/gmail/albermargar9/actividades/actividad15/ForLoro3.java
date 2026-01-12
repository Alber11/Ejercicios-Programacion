package com.gmail.albermargar9.actividades.actividad15;

import java.util.Scanner;

public class ForLoro3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        for (int i=1; i<=3; i++){ //el programa solo se ejecutara 3 veces
            System.out.println("escriba un numero");
            numero = sc.nextInt();
            System.out.println("loro: " + numero);
        }
    }
}
