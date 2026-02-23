package com.gmail.albermargar9.Tema1.Actividades.actividad10;

import java.util.Scanner;

public class SwitchMeses1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("en que mes estamos: ");
        int mes = sc.nextInt();
        //como es solo una linea podemos saltar las corchetes
        switch (mes){
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("El mes tiene 31 dias");
            case 2 -> System.out.println("El mes tiene 28 dias");
            case 4, 6, 9, 11 -> System.out.println("El mes tiene 30 dias");
            default -> System.out.println("Ese mes no existe");
        }
    }
}
