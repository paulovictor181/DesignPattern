package command;

import javax.swing.*;

public class AppendTextCommand implements Command {
    private JTextArea textArea; // O Receptor
    private String textToAppend;

    public AppendTextCommand(JTextArea textArea, String textToAppend) {
        this.textArea = textArea;
        this.textToAppend = textToAppend;
    }

    @Override
    public void execute() {
        textArea.append(textToAppend + "\n");
    }
}
