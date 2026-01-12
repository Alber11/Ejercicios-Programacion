package com.gmail.albermargar9.Tema5;

import java.util.Scanner;

public class Ejercicio3 {
    public static void eco (int n){
        for (int i = 0; i < n; i++) {
            System.out.println("Eco");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("cuantos eco quieres");
        int n = sc.nextInt();
        eco(n);
    }
}
