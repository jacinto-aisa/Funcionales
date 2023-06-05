package org.example;

import org.example.funcionales.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Garage miGarajeTexto = new Garage(
                new GrabarEnDisco(),
                new SupplierDeVehiculos(),
                new FiltroMatriculados(),
                new TransformadorVehiculos());
        for(int c=0;c<1000;c++) {
            miGarajeTexto.add();
        }

        miGarajeTexto.muestra();
        miGarajeTexto.setConsumidor(new MuestraPantalla());
        miGarajeTexto.setFiltro(new ValidadorCoche());
        miGarajeTexto.setGenerador(new SupplierDeVehiculos());
        miGarajeTexto.muestra();
        miGarajeTexto.transforma();
        miGarajeTexto.muestra();

    }
}