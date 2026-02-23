package com.gmail.albermargar9.Tema1.Actividades.actividad15;

import java.util.Scanner;

public class ForEcho2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numero = sc.nextInt();
        while (numero < 1){
            System.out.println("el numero introducido debe ser positivo");
            System.out.print("Introduzca un numero positivo: ");
            numero = sc.nextInt();
        }
        /*for (int i = numero; i>0; i--){
            System.out.print("echo..");
        //es lo mismo que el otro pero convien que el inicializador sipre sea con una variable diferente a la que usamos
        }*/
        for (int i=1; i <= numero; i++){
            System.out.println("echo..");
        }
    }
}
