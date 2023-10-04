package Test;

import org.example.ListaOrdenada;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ListaOrdenadaTest {
    @Test
    public void removeTest(){
        ListaOrdenada<Integer> listaOrdenada;
        //Creamos lista y añadimos integers
        listaOrdenada = new ListaOrdenada<>();
        listaOrdenada.add(1);
        listaOrdenada.add(123);
        listaOrdenada.add(221);
        listaOrdenada.add(8);

        boolean removed = listaOrdenada.remove(123);
        Assertions.assertTrue(removed);
        Assertions.assertEquals(3, listaOrdenada.size());
    }

    @Test
    public void addTest(){
        ListaOrdenada<Integer> listaOrdenada;
        //Creamos lista y añadimos integers
        listaOrdenada = new ListaOrdenada<>();
        listaOrdenada.add(123);
        listaOrdenada.add(1);
        listaOrdenada.add(221);
        listaOrdenada.add(8);

        Assertions.assertEquals(listaOrdenada.get(0), 1);
        Assertions.assertNotEquals(listaOrdenada.get(0), 123);

    }





}
