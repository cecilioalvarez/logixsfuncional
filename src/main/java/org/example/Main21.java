package org.example;

import java.util.List;

public class Main21 {
    public static void main(String[] args) {





       String resultado=List.of("5", "7", "2", "3", "4", "5", "6")
               .stream()
               .reduce("0", (acumulador, item) -> acumulador + "," +item);

        System.out.println(resultado);


    }
}


