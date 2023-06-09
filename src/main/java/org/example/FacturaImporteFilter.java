package org.example;

public class FacturaImporteFilter implements Filter<Factura> {

    private double importe;

    public FacturaImporteFilter(double importe) {
        this.importe = importe;
    }

    @Override
    public boolean test(Factura f) {
       return f.getImporte()==importe;
    }
}
