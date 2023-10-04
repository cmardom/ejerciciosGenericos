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
    public void primeroTest() {
        //se comprueba que el primer elemento es 1
        Assertions.assertEquals(1, pilaGenericaInteger.primero());
    }

    @Test
    public void toStringTest(){
        String expected = "PilaGenerica{elementos=[1, 2, 3]}";
        String actual = pilaGenericaInteger.toString();
        Assertions.assertEquals(expected, actual);
    }
}