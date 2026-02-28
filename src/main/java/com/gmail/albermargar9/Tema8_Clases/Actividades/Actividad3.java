package com.gmail.albermargar9.Tema8_Clases.Actividades;

import com.gmail.albermargar9.Tema8_Clases.Objetos.Persona;

//Crea los siguientes objetos de tipo Persona y asígnale a sus atributos los valores
//correspondientes.
//Imprime los valores de los atributos antes y después de la asignación.
//Suma las edades de Paco y de Miguel, guarda el resultado en una variable, muestra la
//variable.
//Eleva la estatura de Paco al cuadrado, utiliza para ello Math.pow(). Muestra el resultado por
//pantalla.
//Crea un objeto de tipo vehículo y asigna valores a sus atributos.

public class Actividad3 {
    public static void main(String[] args) {
        Persona persona = new Persona();
        //Imprimos para ver los valores que contienen por defecto
        System.out.println("Nombre: "+ persona.nombre);
        System.out.println("Edad: " + persona.edad);
        System.out.println("Estatura: " + persona.estatura);
        System.out.println("Dni: "+ persona.dni);

        //Accedemos a los atributos y les asignamos un valor
        persona.nombre = "Paco";
        persona.edad = 51;
        persona.estatura = 1.68;
        //El dni no podría modificarse porque es final

        //Imprimos para ver los valores que contienen después de la asignación
        System.out.println("\nNombre: "+ persona.nombre);
        System.out.println("Edad:"+ persona.edad);
        System.out.println("Estatura: " + persona.estatura);
        System.out.println("Dni: "+ persona.dni);


        Persona persona1 = new Persona();

        System.out.println("Nombre: "+ persona1.nombre);
        System.out.println("Edad: " + persona1.edad);
        System.out.println("Estatura: " + persona1.estatura);
        System.out.println("Dni: "+ persona1.dni);

        persona1.nombre = "julio";
        persona1.edad = 40;
        persona1.estatura = 1.60;

        System.out.println("\nNombre: "+ persona1.nombre);
        System.out.println("Edad:"+ persona1.edad);
        System.out.println("Estatura: " + persona1.estatura);
        System.out.println("Dni: "+ persona1.dni);
    }
}
