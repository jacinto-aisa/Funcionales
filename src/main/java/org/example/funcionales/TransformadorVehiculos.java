package org.example.funcionales;

import org.example.Vehiculo;
import org.example.VehiculoAltaGama;

import java.util.function.Function;

public class TransformadorVehiculos implements Function<Vehiculo, VehiculoAltaGama> {

    @Override
    public VehiculoAltaGama apply(Vehiculo vehiculo) {
        return new VehiculoAltaGama(vehiculo.getPrecio(), vehiculo.getMatricula(), 8);
    }
}
