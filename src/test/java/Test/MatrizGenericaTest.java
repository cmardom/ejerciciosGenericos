package Test;
import org.example.MatrizGenerica;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MatrizGenericaTest {

    @Test
    public void setTest(){
    //se crea matriz con enteros
        MatrizGenerica<Integer> matrizEnteros = new MatrizGenerica<>(3, 4);
        matrizEnteros.set(1, 1, 1);
    //se crea matriz con string
        MatrizGenerica<String> matrizString = new MatrizGenerica<>(2, 2);
        matrizString.set(1, 1, "1");

        //se prueban que se insertan los elementos en la posicion 1,1
        Assertions.assertEquals(1, matrizEnteros.get(1, 1));
        Assertions.assertEquals("1", matrizString.get(1, 1));


    }
}
