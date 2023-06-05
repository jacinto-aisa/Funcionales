package org.example.funcionales;

import org.example.Vehiculo;
import org.example.VehiculoAltaGama;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierDeVehiculos implements Supplier<Vehiculo> {
    @Override
    public Vehiculo get() {
        double valor = Math.random();

        if (valor < 0.5)
            return new Vehiculo(valor*789,"pepep");
        else
            return new VehiculoAltaGama(777,"",8);
    }
}
