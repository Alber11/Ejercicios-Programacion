package com.gmail.albermargar9.actividades.actividad10;

import java.util.Scanner;

public class SwitchNotasExamen2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escriba su nota de examen: ");
        int nota = sc.nextInt();
        switch (nota){
            case 0, 1, 2, 3, 4 -> System.out.println("Insufiente");
            case 5, 6 -> System.out.println("Bien");
            case 7, 8 -> System.out.println("Notable");
            case 9, 10 -> System.out.println("Sobresaliente");
            default -> System.out.println("Su nota no es valida");
        }
    }
}
