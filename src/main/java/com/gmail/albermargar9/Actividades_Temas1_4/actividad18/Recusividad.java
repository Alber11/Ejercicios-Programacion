package com.gmail.albermargar9.Actividades_Temas1_4.actividad18;
//usamos recusividad para calcular el factorial

public class Recusividad {
    /**
     * Hace el factorial mediante recusividad
     * @param n el numero que va ha hacer el factorial
     * @return devuelve el resultado
     */
    public static long factorial (long n) {
        //Calcular factorial
        //n*nveces
        //ejemplo 5 * 4 * 3 * 2 * 1
        long resultado;
        if (n==0){
            resultado=1;
        }else {
            resultado=n * factorial(n-1);
        }

        return resultado;
    }
    //no utilizamos recusividad para calcular
    //long tipo de dato que devuelve

    /**
     * Crea el factorial utilizandoun for
     * @param n el numero que va hacer el factorial
     * @return devuelve el resultado
     */
    public static long factorialV2(long n){
        long resultado = 1;
        for (long i = n; i>=1; i--){
            resultado*=i;
        }
        //este es la valor que me va a devolver para ponerlo en otros metodos
        //en este caso devolvemos el resultado y lo imprimimos en main
        //el tipo de dato que queremos devolver es un long que esta especificado en el metodo
        return resultado;
    }

    /**
     * Crea el factorial usando un while
     * @param n el numero al que se va hacer el factorial
     * @return devuelve el resultado
     */
    public  static long factorialV3(long n){
        long resultado = 1;
        while (n > 1){
            resultado*=n;
            n--;
            //resultado * n = x * n -1 //manera interna de hacer el factorial
        }
        return resultado;
    }

    /**
     * Imprime el resultado de los difrentes factoriales que hemos calculados
     * @param args los agumentos a imprimir
     */
    public static void main(String[] args) {
        long resultado = factorial(3);
        System.out.println("Factorial: " + resultado);
        long resultado2 = factorialV2(4);
        System.out.println("Factorial v2: " + resultado2);
        long resultado3 = factorialV3(6);
        System.out.println("Factorial v3: " + resultado3);
    }


}
