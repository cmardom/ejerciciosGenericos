package Test;
import org.example.MatrizGenerica;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;


public class MatrizGenericaTest {
    @Test
    public void filasTest(){
        //se crea matriz con enteros
        MatrizGenerica<Integer> matrizEnteros = new MatrizGenerica<>(3, 4);
        matrizEnteros.set(1, 1, 1);
        //se crea matriz con string
        MatrizGenerica<String> matrizString = new MatrizGenerica<>(2, 2);
        matrizString.set(1, 1, "1");

        //se comprueban los números de filas
        Assertions.assertEquals(3, matrizEnteros.filas());
        Assertions.assertEquals(2, matrizString.filas());
    }

    @Test
    public void columnasTest(){
        //se crea matriz con enteros
        MatrizGenerica<Integer> matrizEnteros = new MatrizGenerica<>(3, 4);
        matrizEnteros.set(1, 1, 1);
        //se crea matriz con string
        MatrizGenerica<String> matrizString = new MatrizGenerica<>(2, 2);
        matrizString.set(1, 1, "1");

        //se comprueban los números de filas
        Assertions.assertEquals(4, matrizEnteros.columnas());
        Assertions.assertEquals(2, matrizString.columnas());
    }

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

    @Test
    public void getTest(){
        //se crea matriz con enteros
        MatrizGenerica<Integer> matrizEnteros = new MatrizGenerica<>(3, 4);
        matrizEnteros.set(1, 1, 1);
        //se crea matriz con string
        MatrizGenerica<String> matrizString = new MatrizGenerica<>(2, 2);
        matrizString.set(1, 1, "1");

        //se comprueba que el elemento en la posición es el correcto
        Assertions.assertEquals(1, matrizEnteros.get(1, 1));
        Assertions.assertEquals("1", matrizString.get(1, 1));

    }

    @Test
    public void toStringTest(){
        //se crea matriz con enteros
        MatrizGenerica<Integer> matrizEnteros = new MatrizGenerica<>(3, 4);
        matrizEnteros.set(1, 1, 1);

        String expectedInt = "MatrizGenerica{" +
                "matriz=" + Arrays.toString(matrizEnteros.getMatriz()) +
                ", filas=" + matrizEnteros.filas() +
                ", columnas=" + matrizEnteros.columnas() +
                '}';

        Assertions.assertEquals(expectedInt, matrizEnteros.toString());
    }
}
