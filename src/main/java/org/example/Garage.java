package org.example;

import org.example.funcionales.FiltroMatriculados;
import org.example.funcionales.MuestraPantalla;
import org.example.funcionales.TransformadorVehiculos;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Garage {
    private ArrayList<Vehiculo> flota;
    private Consumer<Vehiculo> consumidor;
    private Supplier<Vehiculo> generador;
    private Predicate<Vehiculo> filtro;
    private Function<Vehiculo, VehiculoAltaGama> transformer;

    public Garage(Consumer<Vehiculo> consumidor,
                  Supplier<Vehiculo> generador,
                  Predicate<Vehiculo> filtro,
                  Function<Vehiculo,VehiculoAltaGama> transformer) {
        flota = new ArrayList<>();
        this.consumidor = consumidor;
        this.generador = generador;
        this.filtro = filtro;
        this.transformer = transformer;
    }


    public void add()
    {
        flota.add(generador.get());
    }
    public void muestra()
    {
        flota.stream().filter(filtro).forEach(consumidor);
    }

    public void transforma()
    {
        flota.stream().filter(filtro).forEach(p->transformer.apply(p));
    }


    public void setConsumidor(Consumer<Vehiculo> consumidor) {
        this.consumidor = consumidor;
    }

    public void setGenerador(Supplier<Vehiculo> generador) {
        this.generador = generador;
    }

    public void setFiltro(Predicate<Vehiculo> filtro) {
        this.filtro = filtro;
    }
}
