package org.example;

import java.util.Arrays;

public class MatrizGenerica<T> {

//    Escribe una clase Matriz genérica
    private T [][] matriz;
    private int filas;
    private int columnas;

    //    constructor que recibe por parámetro el número de filas y columnas de la matriz.
    public MatrizGenerica(int filas, int columnas){
        this.filas = filas;
        this.columnas = columnas;
        matriz = (T[][]) new Object[filas][columnas];
    }

    public T[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(T[][] matriz) {
        this.matriz = matriz;
    }

//    filas() devuelve el número de filas de las matriz.
    public int filas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    // columnas() devuelve el número de columnas de la matriz.
    public int columnas() {
        return columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

//    set() recibe por parámetro la fila, la columna y el elemento a insertar.
//    El elemento es de tipo genérico. Este método inserta el elemento en la posición indicada.
    public void set(int fila, int columna, T valor) {
        if (fila < 0 || fila >= filas || columna < 0 || columna >= columnas) {
            throw new IndexOutOfBoundsException("Fuera de rango");
        }
        matriz[fila][columna] = valor;
    }



//get() recibe por parámetro la fila y la columna.
// Devuelve el elemento en esa posición. El elemento devuelto es genérico.
    public T get(int fila, int columna) {
        if (fila < 0 || fila >= filas || columna < 0 || columna >= columnas) {
            throw new IndexOutOfBoundsException("Índices de matriz fuera de rango");
        }
        return matriz[fila][columna];
    }

//    toString() devuelve en forma de String la información de la matriz.


    @Override
    public String toString() {
        return "MatrizGenerica{" +
                "matriz=" + Arrays.toString(matriz) +
                ", filas=" + filas +
                ", columnas=" + columnas +
                '}';
    }
}
