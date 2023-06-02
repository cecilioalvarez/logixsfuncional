package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {

        List<Factura> lista = new ArrayList<Factura>();
        lista.add(new Factura(3, "ordenador", 200));
        lista.add(new Factura(2, "tablet", 300));
        lista.add(new Factura(1, "auricular", 50));
        lista.sort(new Comparator<Factura>() {
            @Override
            public int compare(Factura o1, Factura o2) {
                if ( o1.getNumero()>o2.getNumero()) { return 1;}
                else if (o1.getNumero()<o2.getNumero()) {return -1;}
                else return 0;
            }
        });
        for (Factura f: lista) {
            System.out.println(f.getNumero());
            System.out.println(f.getConcepto());
            System.out.println(f.getImporte());

        }

    }
}