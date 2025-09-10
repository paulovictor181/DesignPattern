package factoryMethod;

import factoryMethod.view.ButtonFrame;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ButtonFrame();
        });
    }
}
