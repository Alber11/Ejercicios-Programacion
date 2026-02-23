package com.gmail.albermargar9.Tema1.Actividades.actividad5;

import java.util.Scanner;

public class ComparacionBoleanaEdad1 {
    public static void main(String[] args){
        int edad;
        Scanner lector = new Scanner(System.in);
        System.out.print("Cual es su edad?: ");
        edad = lector.nextInt();
        //podemos asignar variable booleana antes o dentro del print
        boolean Mayor = edad >= 18;
        System.out.println("Eres mayor de edad?");
        System.out.println(Mayor);
        //aqui lo hacemos dentro del print
        // System.out.println(edad >= 18);

    }

}
