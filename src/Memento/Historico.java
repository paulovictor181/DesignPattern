package Memento;

import java.util.Stack;

public class Historico {
    private Stack<EditorState> history = new Stack<>();

    private EditorDeTexto originator;

    public Historico(EditorDeTexto editor) {
        this.originator = editor;
    }

    public void salvarBackup() {
        EditorState m = originator.save();
        history.push(m);
        System.out.println("Backup salvo! Histórico: " + history.size());
    }

    public void desfazer() {
        if (history.isEmpty()) {
            System.out.println(">> (Caretaker) Nada a desfazer.");
            return;
        }

        EditorState m = history.pop();

        originator.restore(m);
        System.out.println("Desfeito! Restam: " + history.size());
    }
}
