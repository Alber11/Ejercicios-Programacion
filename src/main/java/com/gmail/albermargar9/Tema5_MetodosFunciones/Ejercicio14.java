package com.gmail.albermargar9.Tema5_MetodosFunciones;

//Crear una función recursiva
//public static int sumaEnesima(int n)
//que calcule la suma de los números naturales desde 1 hasta N.
//Se debe pasar como parámetro el número N.

public class Ejercicio14 {
    public static int sumaEnesima(int n){
        int resultado;
        if (n==0){
            resultado = 1;
        }else {
            resultado = n+sumaEnesima(n-1);
        }
        return resultado;
    }
    public static void main(String[] args) {
        int resultado = sumaEnesima(4);
        System.out.println("Resultado: " + resultado);
    }
}
