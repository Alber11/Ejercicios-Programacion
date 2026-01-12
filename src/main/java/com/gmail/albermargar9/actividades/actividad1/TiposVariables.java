package com.gmail.albermargar9.actividades.actividad1;

public class TiposVariables {

    public static void main(String[] args) {

        char letra;
        letra = 'h';
        System.out.println(letra);
        char letra2 = 'x';
        System.out.println(letra2);
        char letra3 = 'c';
        System.out.println(letra3);

        //creamos una varaiable doble para luego sumarlo
        double ventas_enero, ventas_febrero;//asigancion de las variables
        ventas_febrero = 34.24;
        ventas_enero = 50.20;
        double ventas_total = ventas_febrero + ventas_enero;//suma de variables
        System.out.println(ventas_total);

        //declararmos una varaiable tipo String (entra dentro de los paquetes de java)
        String nombre = "Hola mi nombre es alberto";
        System.out.println(nombre);

        //salida de datos, combinar texto y variables
        int numero_suerte = 13;
        System.out.println("tu numero de la suerte es: " + numero_suerte);
        //entrada de datos
        String t1 = "hola"; /* t1 ya contiene caracola lo hemos perdido
        al igualarlo con t2 */
        String t2 = "adios"; //t2 es caracola
        t1 = t2; /*al igualar la variable t1 con la t2 la variable t1 se suprime
        y pasa valer el valor de t2+*/
        System.out.println("el valor de t1 es " + t1);
        System.out.println("el valor de t2 es " + t2);
        char c1 = 'A';
        char c2 = 'B';
        c1 = c2;
        System.out.println("el valor de c1 es " + c1);
        System.out.println("el valor de c2 es " + c2);

    }
}

