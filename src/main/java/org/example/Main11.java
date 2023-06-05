package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main11 {
    public static void main(String[] args) {

        List<Factura> lista = new ArrayList<Factura>();
        lista.add(new Factura(3, "ordenador", 200));
        lista.add(new Factura(2, "tablet", 300));
        lista.add(new Factura(1, "auricular", 50));


        Stream<Factura> flujo= lista.stream();
        //high order function
        flujo.filter(f->f.getConcepto().equals("ordenador"))
                .forEach((f)->System.out.println(f));



    }



}


