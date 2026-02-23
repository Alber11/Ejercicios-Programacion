package com.gmail.albermargar9.Actividades_Temas1_4.actividad7;

import java.util.Scanner;

public class BeneficiosPerasManzanas {
    public static void main(String[] args){
        double ventas1Manzanas, ventas2Manzanas, ventas1Peras, ventas2Peras, resultado;
        final double precioPera = 1.95 ;
        final double precioManzana = 2.35 ;
        Scanner lector = new Scanner(System.in);
        System.out.println("*************Para las Manzanas*******************");
        System.out.print("Ventas de manzanas en kilos del primer semestre: ");
        ventas1Manzanas = lector.nextDouble();
        System.out.print("Ventas de manzanas en kilos del segundo semestre: ");
        ventas2Manzanas = lector.nextDouble();
        System.out.println("*************Para las Peras**********************");
        System.out.print("Ventas de peras en kilos del primer semestre: ");
        ventas1Peras = lector.nextDouble();
        System.out.print("Ventas de peras en kilos del segundo semestre: ");
        ventas2Peras = lector.nextDouble();
        System.out.println("**************************************************");
        //operacion
        resultado = (ventas1Manzanas + ventas2Manzanas) * precioManzana + (ventas1Peras + ventas2Peras) * precioPera;
        System.out.println("El importe total es: " + resultado + " euros");
    }
}
