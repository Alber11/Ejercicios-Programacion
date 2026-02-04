package com.gmail.albermargar9.Tema8.EjerciciosEntregar.Clientes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<Cliente> listaClientesList = new ArrayList<>();

        File fichero = new File("Clientes_LF.txt");
        Scanner sc = new Scanner(fichero);

        while (sc.hasNextLine()) {
            String linea = sc.nextLine();
            String[] datos = linea.split(";", -1);

            if (datos.length >= 13) {
                int antiguedad = Integer.parseInt(datos[3]);

                String facturacionStr = datos[4].replace(',', '.');
                double facturacion = Double.parseDouble(facturacionStr);

                Cliente c = new Cliente(
                        datos[0], datos[1], datos[2], antiguedad, facturacion,
                        datos[5], datos[6], datos[7], datos[8], datos[9],
                        datos[10], datos[11], datos[12]
                );

                listaClientesList.add(c);
            }
        }
        sc.close();

        Cliente[] arrayClientes = new Cliente[listaClientesList.size()];
        for (int i = 0; i < listaClientesList.size(); i++) {
            arrayClientes[i] = listaClientesList.get(i);
        }

        muestraPorNacionalidad(arrayClientes);

        System.out.println("****** ********");
        System.out.println("***");

        muestraPorNacionalidad(listaClientesList, "Alemania");
    }

    private static void muestraPorNacionalidad(Cliente[] lista) {
        System.out.println("*** CLIENTES DE ESPAÑA ***");
        int contador = 0;
        double totalFacturacion = 0;

        for (Cliente c : lista) {
            if ("España".equalsIgnoreCase(c.getPais())) {
                contador++;
                totalFacturacion += c.getFacturacion();

                System.out.println("Registro " + contador);
                imprimirDetalle(c);
            }
        }
        imprimirTotales(contador, totalFacturacion);
    }

    private static void muestraPorNacionalidad(ArrayList<Cliente> lista, String nac) {
        System.out.println("*** CLIENTES DE " + nac.toUpperCase() + " ***");
        int contador = 0;
        double totalFacturacion = 0;

        for (Cliente c : lista) {
            if (nac.equalsIgnoreCase(c.getPais())) {
                contador++;
                totalFacturacion += c.getFacturacion();

                System.out.println("Registro " + contador + " (" + nac + ")");
                imprimirDetalle(c);
            }
        }
        imprimirTotales(contador, totalFacturacion);
    }

    private static void imprimirDetalle(Cliente c) {
        System.out.println("Id. Cliente: " + c.getIdCliente());
        System.out.println("Nombre Contacto: " + c.getNombreContacto());
        System.out.println("Antigüedad: " + c.getAntiguedad());
        System.out.println("Facturación: " + c.getFacturacion());
        System.out.println("Nombre Compañía: " + c.getNombreCompania());
        System.out.println("Nombre Ciudad: " + c.getCiudad());
    }

    private static void imprimirTotales(int numClientes, double totalFact) {
        System.out.println("Total clientes:");
        System.out.println(numClientes);
        System.out.println("Total facturación (€):");
        System.out.printf("%,.2f%n", totalFact);
    }
}
