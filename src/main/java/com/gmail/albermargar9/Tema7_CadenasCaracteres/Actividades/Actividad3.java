package com.gmail.albermargar9.Tema7_CadenasCaracteres.Actividades;

//Sabiendo que la M en code point decimal es 77 y en hexadecimal es
//\u004D, ¿cuál será la salida por pantalla y por qué?

public class Actividad3 {
    public static void main(String[] args) {
        int variable1 = 'M';
        System.out.println(variable1);//Muestra 77

        int variable2 = '\u004D';
        System.out.println(variable2);//Muestra 77
        System.out.println((char)variable2);//Muestra M

        char variable3 = 77;
        System.out.println(variable3);//Muestra M
        System.out.println((int)variable3);//Muestra 77

        int variable4 = 77;
        //char variable5 = variable4;//Hay que hacer un cast (char)variable4
        //System.out.println(variable5);//Error
    }
}
