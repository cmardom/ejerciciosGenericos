package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaOrdenada<E extends Comparable<E>> {

//    Escribe una clase genérica ListaOrdenada con un tipo parametrizado E que sea Comparable… < E extends Comparable<E>>....
    private List<E> elementos;

    public ListaOrdenada() {
        elementos = new ArrayList<>();
    }

//    Un constructor
    public ListaOrdenada(List<E> elementos) {
        this.elementos = elementos;
    }

    //    void add(E o) - nota: cuando añado el elemento debería añadirse en el orden adecuado,
    //    recuerda que E tiene que implementar Comparable<E>
    public void add(E elemento) {
        elementos.add(elemento);
        Collections.sort(elementos);
    }

    //    E get(int index)
    public E get(int indice) {
        if (indice < 0 || indice >= elementos.size()) {
            throw new IndexOutOfBoundsException("fuera de rango");
        }
        return elementos.get(indice);
    }

//    int size()
    public int size() {
        return elementos.size();
    }

    //    boolean isEmpty()
    public boolean isEmpty() {
        return elementos.isEmpty();
    }

//    boolean remove(E o)
    public boolean remove(E elemento) {
        boolean borrado = elementos.remove(elemento);
        if (borrado) {
            Collections.sort(elementos); // Reordenar después de borrar
        }
        return borrado;
    }

//    int indexOf(E o)
    public int indexOf(E o) {
        return elementos.indexOf(o);
    }
//    String toString()


    @Override
    public String toString() {
        return "ListaOrdenada{" +
                "elementos=" + elementos +
                '}';
    }
}
