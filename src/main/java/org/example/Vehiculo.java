package org.example;

public class Vehiculo {
    private double precio;
    private String matricula;

    public Vehiculo(double precio, String matricula) {
        this.precio = precio;
        this.matricula = matricula;
    }


    public double getPrecio() {
        return precio;
    }

    public String getMatricula() {
        return matricula;
    }
}
