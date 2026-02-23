package com.gmail.albermargar9.Tema1.Actividades.actividad3;

import java.util.Scanner;

public class OperadoresCalcularEdad {
        public static void main(String[] Args){
        Scanner lector = new Scanner(System.in);
        int anoActual;
        int anoNacimiento;
        System.out.print("En que año estamos? ");
        anoActual = lector.nextInt();
        System.out.print("En que año naciste? ");
        anoNacimiento = lector.nextInt();
        // int total = anoActual + anoNacimiento; se puede crear una variable o hacer la operacion en en el sout
        System.out.print("tienes " + (anoActual-anoNacimiento) + " años");
        //System.out.print("tienes " total + " años"); aqui se puede imprimir si se crea una variable
    }

}
