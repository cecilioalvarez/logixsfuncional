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


        Stream<Factura> flujo= lista.stream();
        //high order function
        //metodos de referecnia reutilizo lo que ya existe
        List<Double> lista2= flujo.filter(f->f.getImporte()>=100).map(Factura::getImporteConIVA).collect(toList());


        for (double d:lista2 ) {

            System.out.println(d);
        }

    }



}


