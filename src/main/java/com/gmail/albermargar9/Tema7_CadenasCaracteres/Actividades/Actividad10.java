package com.gmail.albermargar9.Tema7_CadenasCaracteres.Actividades;

//Declara diferentes cadenas y compáralas con compareToIgnoreCase()
//para ver el comportamiento de la función.

public class Actividad10 {
    public static void main(String[] args) {
        String cadena1 = "Alondra";
        String cadena2 = "alondra";

        //Alondra es menor que alondra, da negativo
        System.out.println(cadena1.compareTo(cadena2));//Muestra -32
        //Si ignoramos las mayúsculas son iguales
        System.out.println(cadena1.compareToIgnoreCase(cadena2));//Muestra 0

        String cadena3 = "NuTRIA";
        String cadena4 = "nutria";
        //nutria es mayor que NuTRIA, da positivo
        System.out.println(cadena4.compareTo(cadena3));//Muestra 32
        //Si ignoramos las mayusculas son iguales
        System.out.println(cadena4.compareToIgnoreCase(cadena3));//Muestra 0
    }

}
