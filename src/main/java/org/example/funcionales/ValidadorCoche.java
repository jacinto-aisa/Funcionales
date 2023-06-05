package org.example.funcionales;

import org.example.Vehiculo;

import java.util.function.Predicate;

public class ValidadorCoche implements Predicate<Vehiculo> {
    @Override
    public boolean test(Vehiculo vehiculo) {
        return vehiculo.getPrecio() > 0;
    }
}
