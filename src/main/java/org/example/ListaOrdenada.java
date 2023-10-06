package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaOrdenada<E extends Comparable<E>> {

    /**
     * Clase genérica ListaOrdenada con un tipo parametrizado E que sea Comparable… < E extends Comparable<E>>
     * @author Carmen
     */
    private List<E> elementos;

    public ListaOrdenada() {
        elementos = new ArrayList<>();
    }

//    Un constructor
    public ListaOrdenada(List<E> elementos) {
        this.elementos = elementos;
    }


    /**
     * Método para añadir un elemento y ordenarlo dentro de la lista
     * @author Carmen
     * @param elemento
     */
    public void add(E elemento) {
        elementos.add(elemento);
        Collections.sort(elementos);
    }

    /**
     * Método para devolver un elemento de la lista a través de su índice. Incluye excepcion outOfBounds
     * @author Carmen
     * @param indice
     */
    public E get(int indice) {
        if (indice < 0 || indice >= elementos.size()) {
            throw new IndexOutOfBoundsException("fuera de rango");
        }
        return elementos.get(indice);
    }

    /**
     * Método wrap para devolver el tamaño de la lista
     * @author Carmen
     */
    public int size() {
        return elementos.size();
    }

    /**
     * Método wrap para comprobar si la lista está vacía
     * @author Carmen
     */    public boolean isEmpty() {
        return elementos.isEmpty();
    }

    /**
     * Método wrap para eliminar un elemento de una lista. Devuelve boolean.
     * @author Carmen
     * @param elemento
     * @return borrado
     */    public boolean remove(E elemento) {
        boolean borrado = elementos.remove(elemento);
        if (borrado) {
            Collections.sort(elementos); // Reordenar después de borrar
        }
        return borrado;
    }

    /**
     * Método wrap para devolver el ídnice de un elemento de la lista
     * @author Carmen
     * @param o
     * @return integer
     */    public int indexOf(E o) {
        return elementos.indexOf(o);
    }

    /**
     * Método Override toString
     * @author Carmen
     * @return String
     */
    @Override
    public String toString() {
        return "ListaOrdenada{" +
                "elementos=" + elementos +
                '}';
    }
}
