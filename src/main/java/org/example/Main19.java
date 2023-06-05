package org.example;

import java.util.List;

public class Main19 {
    public static void main(String[] args) {



        Persona p= new Persona("pepe", new HistorialMedico("catarro",1));
        Persona p2= new Persona("pepe2", new HistorialMedico("gripe",2));
        Persona p3= new Persona("pepe3", new HistorialMedico("lupus",4));
        Persona p4= new Persona("pepe4", new HistorialMedico("cancer",5));
        Persona p5= new Persona("pepe5", new HistorialMedico("rotura",4));
        Persona p6= new Persona("pepe6", new HistorialMedico("corte",2));

        List.of(p,p2,p3,p4,p5,p6)
                .stream()
                .map(Persona::getHistorial)
                .filter( h->h.getGravedad()>=4)
                .forEach((h)->System.out.println(h.getGravedad()+" "+h.getEnfermedad()));



    }
}


