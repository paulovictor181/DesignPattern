package Memento;

public class EditorState {
    private final String state;

    public EditorState(String conteudo) {
        this.state = conteudo;
    }

    public String getConteudo() {
        return this.state;
    }
}
