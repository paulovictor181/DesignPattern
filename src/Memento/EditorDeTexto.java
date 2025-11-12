package Memento;

import javax.swing.*;

public class EditorDeTexto {
    private JTextArea textArea;

    public EditorDeTexto(JTextArea textArea) {
        this.textArea = textArea;
    }

    public EditorState save() {
        System.out.println(">> (Originator) Salvando estado...");
        return new EditorState(textArea.getText());
    }

    public void restore(EditorState memento) {
        textArea.setText(memento.getConteudo());
        System.out.println(">> (Originator) Estado restaurado.");
    }
}
