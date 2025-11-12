package Memento;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Editor com Memento (Estrutura Correta)");
        JTextArea textArea = new JTextArea();
        JButton salvarButton = new JButton("Salvar Estado");
        JButton desfazerButton = new JButton("Desfazer");

        EditorDeTexto editor = new EditorDeTexto(textArea);

        Historico historico = new Historico(editor);

        salvarButton.addActionListener(e -> {
            historico.salvarBackup();
        });

        desfazerButton.addActionListener(e -> {
            historico.desfazer();
        });

        JPanel painelBotoes = new JPanel();
        painelBotoes.add(salvarButton);
        painelBotoes.add(desfazerButton);

        frame.setLayout(new BorderLayout());
        frame.add(new JScrollPane(textArea), BorderLayout.CENTER);
        frame.add(painelBotoes, BorderLayout.SOUTH);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        frame.setLocationRelativeTo(null);

        SwingUtilities.invokeLater(() -> frame.setVisible(true));
    }
}
