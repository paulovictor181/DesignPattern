package iterator.implExemplo;

import iterator.implExemplo.AVL.No;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class IteradorPreOrdem<T> implements Iterator<T> {
    private Queue<No<T>> fila = new LinkedList<>();

    public IteradorPreOrdem(No<T> raiz) {
        preencherFila(raiz);
    }

    private void preencherFila(No<T> no) {
        if (no != null) {
            fila.add(no);
            preencherFila(no.esq);
            preencherFila(no.dir);
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
