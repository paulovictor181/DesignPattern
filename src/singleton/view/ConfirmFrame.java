package singleton.view;

import singleton.ui.ConfirmFactory;
import singleton.ui.Interfaces.UiButton;
import singleton.ui.Interfaces.UiFactory;

import javax.swing.*;

public class ConfirmFrame extends JFrame {
    public ConfirmFrame() {
        UiFactory confirmButtonCreator = ConfirmFactory.getInstance();
        UiButton confirmButton = confirmButtonCreator.createUiButton();

        JPanel panel = new JPanel();
        panel.add(confirmButton.getButton());

        this.add(panel);
        this.setTitle("Confirmar Frame");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }
}