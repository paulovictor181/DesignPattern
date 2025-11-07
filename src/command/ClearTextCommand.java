package command;

import javax.swing.*;

public class ClearTextCommand implements Command {
    private JTextArea textArea; // O Receptor

    public ClearTextCommand(JTextArea textArea) {
        this.textArea = textArea;
    }

    @Override
    public void execute() {
        textArea.setText("");
    }
}