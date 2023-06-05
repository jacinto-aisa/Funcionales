package org.example.funcionales;

import com.sun.xml.internal.stream.buffer.stax.StreamWriterBufferCreator;
import org.example.Vehiculo;

import java.util.function.Consumer;

public class GrabarEnDisco implements Consumer<Vehiculo> {
    @Override
    public void accept(Vehiculo vehiculo) {
        System.out.println("Grabar en disco");
    }
}
