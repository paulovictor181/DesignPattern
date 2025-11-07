package iterator.implJava;

import iterator.implJava.AVL.No;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class IteradorPosOrdem<T> implements Iterator<T> {
    private Queue<No<T>> fila = new LinkedList<>();

    public IteradorPosOrdem(No<T> raiz) {
        preencherFila(raiz);
    }

    private void preencherFila(No<T> no) {
        if (no != null) {
            preencherFila(no.esq);  // 1. Esquerda
            preencherFila(no.dir);  // 2. Direita
            fila.add(no);           // 3. Visita (adiciona na fila)
        }
    }

    @Override
    public boolean hasNext() {
        return !fila.isEmpty();
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return fila.poll().getDado();
    }
}
