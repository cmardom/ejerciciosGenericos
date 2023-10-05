package Test;
import org.example.PilaGenerica;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;

public class PilaGenericaTest {
    //se crea lista de integer
    LinkedList<Integer> listaEnteros = new LinkedList<>(Arrays.asList(1, 2, 3));
    //se añade a la pila generica
    PilaGenerica<Integer> pilaGenericaInteger = new PilaGenerica<>(listaEnteros);

    @Test
    public void toStringTest(){
        String expected = "PilaGenerica{elementos=[1, 2, 3]}";
        String actual = pilaGenericaInteger.toString();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void estaVaciaTest(){
        //comprobamos que no esta vacia
        Assertions.assertFalse(pilaGenericaInteger.estaVacia());
    }

    @Test
    public void extraerTest(){
        //devuelve y elimina el primer elemento
        Assertions.assertEquals(1, pilaGenericaInteger.extraer());
    }

    @Test
    public void primeroTest() {
        //se comprueba que el primer elemento es 1
        Assertions.assertEquals(1, pilaGenericaInteger.primero());
    }

    @Test
    public void aniadirTest(){
        //se comprueba que se añade al principio el elemento
        int elemento = 24;
        boolean principio = true;
        pilaGenericaInteger.aniadir(elemento, principio);
        Assertions.assertEquals(elemento, pilaGenericaInteger.extraer());
    }
}