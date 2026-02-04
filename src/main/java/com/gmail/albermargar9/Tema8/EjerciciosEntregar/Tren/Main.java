package com.gmail.albermargar9.Tema8.EjerciciosEntregar.Tren;

import com.gmail.albermargar9.Tema8.EjerciciosEntregar.Tren.Maquinaria.Locomotora;
import com.gmail.albermargar9.Tema8.EjerciciosEntregar.Tren.Maquinaria.Tren;
import com.gmail.albermargar9.Tema8.EjerciciosEntregar.Tren.Maquinaria.Vagon;
import com.gmail.albermargar9.Tema8.EjerciciosEntregar.Tren.Personal.JefeEstacion;
import com.gmail.albermargar9.Tema8.EjerciciosEntregar.Tren.Personal.Maquinista;
import com.gmail.albermargar9.Tema8.EjerciciosEntregar.Tren.Personal.Mecanico;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n--- MAQUINISTA ---");
        Maquinista maq1 = new Maquinista("Juan Pérez", "12345678A", 2000.0, "Junior");
        maq1.mostrarInformacion();
        maq1.aumentarSueldo(500);
        System.out.println("(Sueldo aumentado)");
        maq1.reducirSueldo(100);
        System.out.println("(Sueldo reducido)");
        maq1.cambiarRango("Senior");
        System.out.println("(Rango cambiado)");
        maq1.mostrarInformacion();

        System.out.println("\n--- MECÁNICOS ---");
        Mecanico mec1 = new Mecanico("Ana López", "87654321B");
        mec1.setTelefono("666777888");
        mec1.mostrarInformacion();
        mec1.incluirOtraEspecialidad("Frenos");
        mec1.incluirOtraEspecialidad("Hidráulica");
        System.out.println("(Especialidades añadidas)");
        mec1.mostrarInformacion();
        Mecanico mec2 = new Mecanico("Luis García", "11223344C");
        mec2.mostrarInformacion();

        System.out.println("\n--- JEFE DE ESTACIÓN ---");
        JefeEstacion jefe = new JefeEstacion("Carlos Ruiz", "99887766D", LocalDate.now());
        jefe.mostrarInformacion();

        System.out.println("\n--- LOCOMOTORA ---");
        Locomotora loco1 = new Locomotora("LOC-123", 5000, 2010, mec1);
        loco1.mostrarInformacion();
        System.out.println("(Cambiar mecánico...)");
        loco1.cambiarMecanico(mec2);
        loco1.mostrarInformacion();


        System.out.println("\n--- VAGONES ---");
        Vagon v1 = new Vagon(1, 10000, 5000, "Madera");
        Vagon v2 = new Vagon(2, 12000, 6000, "Hierro");
        Vagon v3 = new Vagon(3, 15000, 8000, "Acero");
        Vagon v4 = new Vagon(4, 10000, 2000, "Carbón");
        Vagon v5 = new Vagon(5, 20000, 10000, "Coches");
        Vagon v6 = new Vagon(6, 5000, 1000, "Alimentos");

        v1.mostrarInformacion();
        v2.mostrarInformacion();
        v3.mostrarInformacion();
        v4.mostrarInformacion();
        v5.mostrarInformacion();

        System.out.println("(Modificar Vagón 1...)");
        v1.aumentarCarga(2000);
        v1.disminuirCarga(500);
        v1.cambiarTipoMercancia("Muebles");
        v1.mostrarInformacion();

        System.out.println("\n--- TREN ---");
        Tren miTren = new Tren(loco1, maq1);

        miTren.engancharVagon(v1);
        miTren.mostrarInformacion();

        miTren.engancharVagon(v2);
        miTren.mostrarInformacion();

        miTren.engancharVagon(v3);
        miTren.engancharVagon(v4);
        miTren.engancharVagon(v5);

        System.out.println("(Intento de añadir 6º vagón...)");
        miTren.engancharVagon(v6);

        System.out.println("\n=== ESTADO FINAL DEL TREN ===");
        miTren.mostrarInformacion();
    }
}
