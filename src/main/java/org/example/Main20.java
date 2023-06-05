package org.example;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class Main20 {
    public static void main(String[] args) {





       int resultado=List.of(5, 7, 2, 3, 4, 5, 6)
               .stream()
               .reduce(0, (acumulador, item) -> acumulador + item);

        System.out.println(resultado);


    }
}


