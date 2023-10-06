package Test;

import org.example.ListaOrdenada;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ListaOrdenadaTest {
    ListaOrdenada<Integer> listaOrdenada;

    @BeforeEach
    void setUp(){
        //Creamos lista y añadimos integers
        listaOrdenada = new ListaOrdenada<>();
        listaOrdenada.add(123);
        listaOrdenada.add(1);
        listaOrdenada.add(221);
        listaOrdenada.add(8);
    }


    @Test
    @DisplayName("Comprobar elemento y posición después de añadir, con add")
    public void addTest(){
        Assertions.assertEquals(this.listaOrdenada.get(0), 1);
        Assertions.assertNotEquals(this.listaOrdenada.get(0), 123);

    }

    @Test
    @DisplayName("Comprobar elemento y posición después de añadir, con get")
    public void getTest(){
        Assertions.assertEquals(1, this.listaOrdenada.get(0));
    }

    @Test
    @DisplayName("Comprobar tamaño")
    public void sizeTest(){
        Assertions.assertEquals(4, this.listaOrdenada.size());
    }

    @Test
    @DisplayName("Comprobar que la lista está vacía")
    public void isEmptyTest(){
        Assertions.assertEquals(false, this.listaOrdenada.isEmpty());
    }


    @Test
    @DisplayName("Comprobar que se borra el elemento indicado")
    public void removeTest(){
        boolean removed = this.listaOrdenada.remove(123);
        Assertions.assertTrue(removed);
        Assertions.assertEquals(3, this.listaOrdenada.size());
    }

    @Test
    @DisplayName("Comprobar el índice del elemento indicado")
    public void indexOfTest(){
        Assertions.assertEquals(2, this.listaOrdenada.indexOf(123));
    }

    @Test
    @DisplayName("Comprobar que el String devuelto es el correcto")
    public void toStringTest(){
        String expected = "ListaOrdenada{elementos=[1, 8, 123, 221]}";
        Assertions.assertEquals(expected, this.listaOrdenada.toString());
    }






}
