package org.example;

import java.util.Comparator;

public class ComparatorFacturaConcepto implements Comparator<Factura> {
    @Override
    public int compare(Factura o1, Factura o2) {
      return o1.getConcepto().compareTo(o2.getConcepto());
    }
}
