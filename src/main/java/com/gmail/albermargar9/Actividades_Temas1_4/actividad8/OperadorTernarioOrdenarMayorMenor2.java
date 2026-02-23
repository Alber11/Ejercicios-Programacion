package com.gmail.albermargar9.Actividades_Temas1_4.actividad8;

import java.util.Scanner;

public class OperadorTernarioOrdenarMayorMenor2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        int numero1 = sc.nextInt();
        System.out.print("introduzca otro numero: ");
        int numero2 = sc.nextInt();
        int valor1 = (numero1 > numero2) ? (numero1):(numero2);
        int valor2 = numero1 < numero2 ? numero1 : numero2;
        System.out.print(valor1 + "," + valor2);





    }
}
