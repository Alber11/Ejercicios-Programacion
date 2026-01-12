package com.gmail.albermargar9.actividades.actividad17;

import java.util.Scanner;

public class MetodoImprimirNumeros2 {

    public static void NumerosComprendidios(int num, int num2){
        int mayor = num>num2 ? num:num2;
        int menor = num<num2 ? num:num2;
        for (int i = menor; i<=mayor; i++){
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba un numero");
        int num = sc.nextInt();
        System.out.println("Escriba otro numero");
        int num2 = sc.nextInt();
        NumerosComprendidios(num,num2);

    }
}
