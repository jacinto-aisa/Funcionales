package org.example.funcionales;

import org.example.Vehiculo;

import java.util.function.Consumer;

public class MuestraPantalla implements Consumer<Vehiculo> {
    @Override
    public void accept(Vehiculo vehiculo) {
        System.out.println(
                "Matricula: "+vehiculo.getMatricula()+ "\n" +
                        "orecio: "+vehiculo.getPrecio()+ "\n");
    }
}
