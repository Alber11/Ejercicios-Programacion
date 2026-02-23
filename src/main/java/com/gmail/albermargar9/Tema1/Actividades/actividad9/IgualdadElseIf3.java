package com.gmail.albermargar9.Tema1.Actividades.actividad9;

import java.util.Scanner;

public class IgualdadElseIf3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.print("escriba un numero: ");
        num1 = sc.nextInt();
        System.out.print("escriba otro numero: ");
        num2 = sc.nextInt();
         if (num1 == num2){
             System.out.println("los numeros son iguales");
         }else{
             System.out.println("los numeros son distintos");
         }

    }

}
