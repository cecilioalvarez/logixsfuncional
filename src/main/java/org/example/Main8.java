package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main8 {
    public static void main(String[] args) {

        List<Factura> lista = new ArrayList<Factura>();
        lista.add(new Factura(3, "ordenador", 200));
        lista.add(new Factura(2, "tablet", 300));
        lista.add(new Factura(1, "auricular", 50));
        //la hemos referenciado con una varialbe
        Filter lambda1= f->f.getConcepto().equals("ordenador");

        Filter lambda2= f->f.getImporte()==200;
        Filter lambdaCombinado= lambda1.not();


        List<Factura> filtrada= buscarFacturas(lambdaCombinado, lista);
        //List<Factura> filtrada= buscarFacturas(new FacturaConceptoFilter("ordenador"), lista);
        for (Factura f: filtrada) {
            System.out.println(f.getNumero());
            System.out.println(f.getConcepto());
            System.out.println(f.getImporte());

        }

    }
    public static List<Factura> buscarFacturas(Filter filter, List<Factura> lista) {
        List<Factura> listaFinal = new ArrayList<Factura>();

        for (Factura f: lista) {

          if (filter.test(f)) {

              listaFinal.add(f);
          }
         }
        return listaFinal;
    }

}


