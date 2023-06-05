package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class Main12 {
    public static void main(String[] args) {

        List<Factura> lista = new ArrayList<Factura>();
        lista.add(new Factura(3, "ordenador", 200));
        lista.add(new Factura(2, "tablet", 300));
        lista.add(new Factura(1, "auricular", 50));


        Stream<Factura> flujo= lista.stream();
        //high order function
        Function<Factura,Factura> mifuncion=(f)->new Factura(f.getNumero(),f.getConcepto(),f.getImporte()*2);
        flujo
                .map(mifuncion)
                .peek((f)->System.out.println("******"+f+"********"))
                .map(mifuncion)
                .peek((f)->System.out.println("******"+f+"********"))
                .forEach((f)->System.out.println(f));



    }



}


