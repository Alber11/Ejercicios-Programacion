package com.gmail.albermargar9.Actividades_Temas1_4.actividad15;

import java.util.Scanner;

public class ForTablasMultiplicar4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        do {
            System.out.print("Escriba un numero del 1 al 10: ");
            numero = sc.nextInt();
            if (numero < 1 || numero > 10){
                System.out.println("El numero es incorrecto");
            }
        }while (numero < 1 || numero > 10);

        System.out.println("tabla del " + numero);
        for (int i = 1; i<=10 ; i++){
            //int resultado = numero * i;
            //System.out.println(numero + " x " + i + " = " + resultado);
            System.out.printf("%d x %d =%d\n",numero,i,numero*i);
        }
    }
}
