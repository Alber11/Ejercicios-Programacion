package com.gmail.albermargar9.Tema5_MetodosFunciones;

//Crear una función recursiva
//public static int sumaEnesima(int n)
//que calcule la suma de los números naturales desde 1 hasta N.
//Se debe pasar como parámetro el número N.

public class Ejercicio14_v2 {
    public static int sumaEnesima(int n){
        int resultado=1;
        for (int i = 1; i <= n; i++) {
            resultado+=i;
        }
        return resultado;
    }

    public static void main(String[] args) {
        System.out.println("Resultado: " + sumaEnesima(4));
    }
}
