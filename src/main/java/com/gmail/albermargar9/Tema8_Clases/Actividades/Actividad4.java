package com.gmail.albermargar9.Tema8_Clases.Actividades;

//1. Programa en la clase Persona el método crecer. El método será de tipo void.
//Recibirá como parámetro de entrada el incremento, es decir, la longitud que
//crecerá la persona.
//2. Programa en la clase Persona el método despedirse. El método será de tipo
//void. Mostrará un texto de despedida.

import com.gmail.albermargar9.Tema8_Clases.Objetos.Persona;

import java.util.Scanner;

public class Actividad4 {
    Persona persona = new Persona();

    public void crecer (double crecimiento){
        System.out.println("cuanto va ha crecer la persona?");
        Scanner sc = new Scanner(System.in);
        crecimiento = sc.nextDouble();
    }

}
