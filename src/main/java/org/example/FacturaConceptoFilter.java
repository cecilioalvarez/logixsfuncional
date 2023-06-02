package org.example;

public class FacturaConceptoFilter implements  FacturaFilter{
   private String concepto;

    public FacturaConceptoFilter(String concepto) {
        this.concepto = concepto;
    }

    @Override
    public boolean filter(Factura f) {

      return  f.getConcepto().equals(concepto);
    }
}
