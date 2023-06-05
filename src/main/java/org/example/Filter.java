package org.example;

@FunctionalInterface
public interface Filter<T> {

    public boolean test(T t);

    //añademe un metodo por defecto esto es nuevo de Java 8
    // y permite añadir funcionalidad a un interface
    //instancia
    default Filter<T> or (Filter<T> filtro) {
        //lo que hace es combina expresiones lambda
        return (T t)-> {return test(t) || filtro.test(t);};
    }

    default Filter<T> and (Filter<T> filtro) {
        //lo que hace es combina expresiones lambda
        return (T t)-> {return test(t) && filtro.test(t);};
    }

    default Filter<T> not () {
        //lo que hace es combina expresiones lambda
        return (T t)-> {return !test(t);};
    }

    static <T> Filter<T> combine (Filter<T>... filters) {

        Filter<T> filter= filters[0];
        for (int i=1;i<filters.length;i++) {

            filter.and(filters[i]);
        }
      return filter;

    }
}
