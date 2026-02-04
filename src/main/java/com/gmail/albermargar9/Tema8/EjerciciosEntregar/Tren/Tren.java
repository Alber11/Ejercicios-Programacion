package com.gmail.albermargar9.Tema8.EjerciciosEntregar.Tren;

public class Tren {
    private Locomotora locomotora;
    private Vagon[] vagones;
    private Maquinista maquinista;
    private int numVagones;

    public Tren(Locomotora locomotora, Maquinista maquinista) {
        this.locomotora = locomotora;
        this.maquinista = maquinista;
        this.vagones = new Vagon[5];
        this.numVagones = 0;
    }

    public void engancharVagon(Vagon vagon) {
        if (numVagones >= 5) {
            System.out.println("El tren no admite más vagones");
        } else {
            vagones[numVagones] = vagon;
            numVagones++;
            System.out.println("Vagón enganchado. Total vagones: " + numVagones);
        }
    }

    public void mostrarInformacion() {
        System.out.println("=== INFO TREN ===");
        System.out.println("Locomotora asignada:");
        locomotora.mostrarInformacion();
        System.out.println("Maquinista responsable:");
        maquinista.mostrarInformacion();
        System.out.println("Vagones (" + numVagones + "/5):");
        for (int i = 0; i < numVagones; i++) {
            vagones[i].mostrarInformacion();
        }
        System.out.println("=================");
    }
}
