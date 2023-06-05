package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Main16 {
    public static void main(String[] args) {

        List<Factura> lista = new ArrayList<Factura>();
        lista.add(new Factura(3, "ordenador", 200));
        lista.add(new Factura(2, "tablet", 300));
        lista.add(new Factura(1, "auricular", 50));
        lista.add(new Factura(4, "funda", 25));
        lista.add(new Factura(5, "mesa", 200));
        lista.add(new Factura(6, "monitor", 700));


        Stream<Factura> flujo= lista.stream();

        flujo.skip(2).limit(2).forEach(System.out::println);
    }



}


