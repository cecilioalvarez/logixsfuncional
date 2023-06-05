package org.example;

public class FacturaConceptoFilter implements Filter<Factura> {
   private String concepto;

    public FacturaConceptoFilter(String concepto) {
        this.concepto = concepto;
    }
    @Override
    public boolean test(Factura f) {

      return  f.getConcepto().equals(concepto);
    }
}
