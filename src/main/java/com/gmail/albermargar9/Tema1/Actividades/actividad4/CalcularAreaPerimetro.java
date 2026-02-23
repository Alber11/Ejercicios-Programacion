package com.gmail.albermargar9.Tema1.Actividades.actividad4;

import java.util.Scanner;

public class CalcularAreaPerimetro {
    public static void main(String[] args){
       Scanner lector = new Scanner(System.in);
       double area, perimetro, radio;
        System.out.print("Cual es el radio: ");
        radio = lector.nextDouble();

        //usamos numeros normales
        /*area = 3.14 + radio * radio;
        perimetro = 2 * 3.14 * radio;*/

        //usamos variables math.pi y math.pow
        area = Math.PI + Math.pow(radio, 2);
        perimetro = 2 * Math.PI * radio;

        System.out.println("el perimetro es: " + perimetro);
        System.out.print("el area es: " + area );



    }
}
