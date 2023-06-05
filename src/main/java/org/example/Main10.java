package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main10 {
    public static void main(String[] args) {

        List<Factura> lista = new ArrayList<Factura>();
        lista.add(new Factura(3, "ordenador", 200));
        lista.add(new Factura(2, "tablet", 300));
        lista.add(new Factura(1, "auricular", 50));
        //la hemos referenciado con una varialbe
        Predicate<Factura> lambda1 = f -> f.getConcepto().equals("ordenador");
        Predicate<Factura> lambda2 = f -> f.getImporte() == 200;
        Predicate<Factura> combinado = lambda1.or(lambda2);


        List<Factura> filtrada = buscarFacturas(combinado, lista);
        //List<Factura> filtrada= buscarFacturas(new FacturaConceptoFilter("ordenador"), lista);
        for (Factura f : filtrada) {
            System.out.println(f.getNumero());
            System.out.println(f.getConcepto());
            System.out.println(f.getImporte());

        }

    }

    public static List<Factura> buscarFacturas(Predicate<Factura> filter, List<Factura> lista) {
        List<Factura> listaFinal = new ArrayList<Factura>();

        for (Factura f : lista) {

            if (filter.test(f)) {

                listaFinal.add(f);
            }
        }
        return listaFinal;
    }

}


