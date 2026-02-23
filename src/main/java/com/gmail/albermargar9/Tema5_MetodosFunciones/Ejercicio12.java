package com.gmail.albermargar9.Tema5_MetodosFunciones;

import java.util.Scanner;

//1. Define la función calculadora(), a la que se le pasan dos números reales
//(operandos) y qué operación se desea realizar con ellos.
//Las operaciones disponibles con: sumar, restar, multiplicar o dividir. Estas se
//especifican mediante un número: 1 para la suma, 2 para la resta, 3 para la
//multiplicación y 4 para la división. La función devolverá el resultado de la
//operación mediante un número real.
//2. Crea una función main que solicite los operandos de la operación, muestre el
//menú de opciones (puedes crear una función para esta parte también), solicite
//una opción y calcule la operación asociada con la calculadora.

public class Ejercicio12 {
    public static void menuCalculadora(){
        System.out.println("Menu calculadora");
        System.out.println("********Opciones********");
        System.out.println("1- Sumar");
        System.out.println("2- Restar");
        System.out.println("3- Multiplicar");
        System.out.println("4- Dividir");
        System.out.println("************************");
    }
    public static double calculadora(double operando1, double operando2, int operacion){
        double resultado;
        switch (operacion){
            case 1 -> resultado = operando1 + operando2;
            case 2 -> resultado = operando1 - operando2;
            case 3 -> resultado = operando1 * operando2;
            case 4 ->{ //en la division si dividimos entre 0 nos va a dar error por lo que tnemos que solucionar eso
                if (operando2 != 0){
                    resultado = operando1 / operando2;
                } else {
                    System.out.println("operacion no valida");
                    resultado = 0;
                }
            }
            default -> {
                System.out.println("Operacion no valida");
                resultado = 0;
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        menuCalculadora(); //llamamos por el main a quer imprima el metodo/funcion que hemos creado
        System.out.print("Operando 1: ");
        double operando1 = sc.nextDouble();
        System.out.print("Operando 2: ");
        double opernado2 = sc.nextDouble();
        System.out.println("Tipo de operacion a realizar");
        int operacion = sc.nextInt();
        while (operacion<1 || operacion>4){//chequeo de seguriada que las operacion esten dentro de las validas
            System.out.println("operacion no valida");
            operacion = sc.nextInt();
        }
        System.out.println("Resultado = " + calculadora(operando1, opernado2, operacion));
    }
}
