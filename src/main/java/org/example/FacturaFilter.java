package org.example;

public interface FacturaFilter {

    public boolean test(Factura f);
    //añademe un metodo por defecto esto es nuevo de Java 8
    // y permite añadir funcionalidad a un interface
    //instancia
    default  FacturaFilter or (FacturaFilter filtro) {
        //lo que hace es combina expresiones lambda
        return (Factura f)-> {return test(f) || filtro.test(f);};
    }
}
