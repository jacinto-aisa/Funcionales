package org.example;

public class VehiculoAltaGama extends Vehiculo{
    private int numeroDiamantes;

    public VehiculoAltaGama(double precio, String matricula, int numeroDiamantes) {
        super(precio, matricula);
        this.numeroDiamantes = numeroDiamantes;
    }
}
