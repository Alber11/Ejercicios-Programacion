package com.gmail.albermargar9.Tema6.Ejercicios;

public class Ejercicio9 {
    public static int maximo(int [] tabla){
        int maximo = tabla[0];
        for (int elemento : tabla){
            if (elemento>maximo){
                maximo = elemento;
            }
        }
        return maximo;
    }

    public static void main(String[] args) {
        int [] numeros = {7,2,-6,7,0,2};
        System.out.println("El numero mayor es: " + maximo(numeros));
    }
}
