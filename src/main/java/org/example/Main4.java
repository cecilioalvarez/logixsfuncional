package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main4 {
    public static void main(String[] args) {

        List<Factura> lista = new ArrayList<Factura>();
        lista.add(new Factura(3, "ordenador", 200));
        lista.add(new Factura(2, "tablet", 300));
        lista.add(new Factura(1, "auricular", 50));

        List<Factura> filtrada= buscarPorNumero(1, lista);
        for (Factura f: filtrada) {
            System.out.println(f.getNumero());
            System.out.println(f.getConcepto());
            System.out.println(f.getImporte());

        }

    }
    public static List<Factura> buscarPorConcepto(String concepto, List<Factura> lista) {
        List<Factura> listaFinal = new ArrayList<Factura>();


        for (Factura f: lista) {

            if (f.getConcepto().equals(concepto)) {

                listaFinal.add(f);
            }
         }
        return listaFinal;
    }
    public static List<Factura> buscarPorNumero(int  numero, List<Factura> lista) {
        List<Factura> listaFinal = new ArrayList<Factura>();


        for (Factura f: lista) {

            if (f.getNumero()==numero) {

                listaFinal.add(f);
            }
        }
        return listaFinal;
    }
}


