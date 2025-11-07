package iterator.implExemplo;

import iterator.implExemplo.AVL.No;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class IteradorEmOrdem<T> implements Iterator<T> {
    private Queue<No<T>> fila = new LinkedList<>();

    public IteradorEmOrdem(No<T> raiz) {
        preencherFila(raiz);
    }

    private void preencherFila(No<T> no) {
        if (no != null) {
            preencherFila(no.esq);
            fila.add(no);
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
            throw new NoSuchElementException("Não há mais elementos na árvore.");
        }

        No<T> no = fila.poll();
        return no.getDado();
    }
}
