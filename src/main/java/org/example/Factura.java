package org.example;

import java.util.Objects;

public class Factura implements Comparable<Factura>{

    private int numero;
    private String concepto;
    private double importe;
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public Factura(int numero, String concepto, double importe) {
        this.numero = numero;
        this.concepto = concepto;
        this.importe = importe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Factura factura = (Factura) o;
        return numero == factura.numero;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero);
    }

    @Override
    public int compareTo(Factura o) {
     if ( this.getNumero()>o.getNumero()) { return 1;}
     else if (this.getNumero()<o.getNumero()) {return -1;}
     else return 0;

    }

    @Override
    public String toString() {
        return "Factura{" +
                "numero=" + numero +
                ", concepto='" + concepto + '\'' +
                ", importe=" + importe +
                '}';
    }
    public double getImporteConIVA() {

        return this.getImporte()*1.21;
    }
}
