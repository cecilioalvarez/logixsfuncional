package org.example;

import java.util.List;
import java.util.Optional;

public class Main21 {
    public static void main(String[] args) {

        Optional<Integer> maximo= List.of(5, 7, 2, 3, 4, 5, 6)
               .stream().max(Integer::compare);

        if(maximo.isPresent()) System.out.println(maximo.get());
        System.out.println(maximo);


    }
}


