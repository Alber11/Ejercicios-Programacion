package com.gmail.albermargar9.actividades.actividad17;

public class MetodoPintarCuadrado4 {
    public static void Cuadrado(int numero){
        for (int i = 1; i<=numero; i++){
            for (int j = 1; j <=numero; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Cuadrado(5);
        System.out.println();
        Cuadrado(3);
    }
}
