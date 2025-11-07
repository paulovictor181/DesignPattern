package command;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {

            JFrame frame = new JFrame("Exemplo Command (Separado)");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);
            frame.setLayout(new BorderLayout());

            JTextArea textArea = new JTextArea();
            frame.add(new JScrollPane(textArea), BorderLayout.CENTER);

            //  Criar os Comandos
            Command appendCmd = new AppendTextCommand(textArea, "Olá, mundo!");
            Command clearCmd = new ClearTextCommand(textArea);

            //  Criação dos Botões
            JButton buttonAppend = new JButton("Adicionar Texto");
            JButton buttonClear = new JButton("Limpar");

            buttonAppend.addActionListener(new CommandActionListener(appendCmd));
            buttonClear.addActionListener(new CommandActionListener(clearCmd));

            JPanel buttonPanel = new JPanel();
            buttonPanel.add(buttonAppend);
            buttonPanel.add(buttonClear);
            frame.add(buttonPanel, BorderLayout.SOUTH);

            frame.setVisible(true);
        });
    }
}
