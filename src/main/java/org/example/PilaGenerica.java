package org.example;

import java.util.LinkedList;

public class PilaGenerica<T> {

    //Escribe una clase Pila genérica usando para ello un atributo del tipo LinkedList. La clase Pila tendrá los siguientes métodos:

    private LinkedList<T> elementos;

    public PilaGenerica() {
        elementos = new LinkedList<>();
    }

    public PilaGenerica(LinkedList<T> elementos) {
        this.elementos = elementos;
    }

    public LinkedList<T> getElementos() {
        return elementos;
    }

    public void setElementos(LinkedList<T> elementos) {
        this.elementos = elementos;
    }

    //toString(): devuelve en forma de String la información de la colección.
    @Override
    public String toString() {
        return "PilaGenerica{" +
                "elementos=" + elementos +
                '}';
    }

    //estaVacia(): devuelve true si la pila está vacía y false en caso contrario.
    public boolean estaVacia() {
        return elementos.isEmpty();
    }

    //extraer(): devuelve y elimina el primer elemento de la colección.
    public T extraer() {
        if (estaVacia()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return elementos.removeFirst();
    }


    // primero(): devuelve el primer elemento de la colección
    public T primero() {
        if (estaVacia()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return elementos.getFirst();
    }

    //aniadir(): añade un objeto por el extremo que corresponda.
    // true > principio ..... false > final
    public void aniadir(T elemento, boolean principio){
        if (principio){
            elementos.addFirst(elemento);
        } else {
            elementos.addLast(elemento);
        }
    }
}
