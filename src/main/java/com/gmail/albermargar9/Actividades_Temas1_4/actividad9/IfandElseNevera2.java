package com.gmail.albermargar9.Actividades_Temas1_4.actividad9;

import java.util.Scanner;

public class IfandElseNevera2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("cual es la temperatura de la nevera: ");
        int temperatura = sc.nextInt();

        if (temperatura > 8 || temperatura < 2){
            System.out.println("atencion la temperatura esta fuera de rango, temperatura recomendada es de 2 - 8º");

        } else { //si no son iguales....
            System.out.println("la temperatura esta dentro del rango");
        }

    }
}
