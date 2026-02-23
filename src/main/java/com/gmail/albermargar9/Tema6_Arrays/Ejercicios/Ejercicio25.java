package com.gmail.albermargar9.Tema6_Arrays.Ejercicios;

//Crear la función
//public static boolean sonIguales(int tabla1[], int tabla2[])
//que recibe dos tablas y devuelve true si son iguales, y false en caso contario

public class Ejercicio25 {
    public static boolean sonIguales(int tabla1[], int tabla2[]){
        boolean igules = false;

        if (tabla1.length==tabla2.length){
            int i = 0;
            while (i< tabla1.length&& tabla1[i] == tabla2[i]){
                i++;
            }
            if (i==tabla1.length){
                igules= true;
            }
        }
        return igules;
    }

    public static void main(String[] args) {
        int tabla1[] = {7,9,20};
        int tabla2[] = {7,9,20};

        System.out.println(sonIguales(tabla1, tabla2));
    }
}
