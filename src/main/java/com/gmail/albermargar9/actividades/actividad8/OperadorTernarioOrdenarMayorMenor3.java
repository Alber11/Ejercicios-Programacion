package com.gmail.albermargar9.actividades.actividad8;

import java.util.Scanner;

public class OperadorTernarioOrdenarMayorMenor3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        int num1 = sc.nextInt();
        System.out.print("introduzca otro numero: ");
        int num2 = sc.nextInt();
        System.out.print("introduzca otro numero: ");
        int num3 = sc.nextInt();
        int maximo = (num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3) ;
        int minimo = (num1 < num2) ? (num1 < num3 ? num1 : num3) : (num2 < num3 ? num2 : num3) ;
        int medio =  (num1 + num2 +num3) - minimo - maximo;
        /*int maximo = (num1 > num2) ? (Math.max(num1, num3)) : (Math.max(num2, num3)) ;
        int minimo = (num1 < num2) ? (Math.min(num1, num3)) : (Math.min(num2, num3)) ;*/
        System.out.print(maximo + ", " + medio + ", " + minimo);
    }

}
