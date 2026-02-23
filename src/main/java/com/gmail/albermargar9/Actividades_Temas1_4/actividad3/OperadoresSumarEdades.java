package com.gmail.albermargar9.Actividades_Temas1_4.actividad3;
import java.util.Scanner;
public class OperadoresSumarEdades {
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        int edad;
        System.out.print("Cuantos años tienes? ");
        edad = lector.nextInt();
        ++edad;
        System.out.println("tu edad dentro de un año sera:"+ edad);
        System.out.println("***************************************");
        //ejemplo de que si importa cunado se ponen los ++
        int x,y,z;
        x = 1;
        y = x++; //asigna el valor y luego suma
        z = ++x; //suma y luego suma el valor
        System.out.println("x = " + x); // igual a 3
        System.out.println("y = " + y); // sera igual a 1 se ha asignado y luego aumenta
        System.out.println("z = " + z); // sera igual a 3 por que aumento y luego se asigno




    }


}

