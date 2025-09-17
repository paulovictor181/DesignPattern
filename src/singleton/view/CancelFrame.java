package singleton.view;

import singleton.ui.CancelFactory;
import singleton.ui.Interfaces.UiButton;
import singleton.ui.Interfaces.UiFactory;

import javax.swing.*;

public class CancelFrame extends JFrame {
    public CancelFrame() {
        UiFactory cancelButtonCreator = CancelFactory.getInstance();
        UiButton cancelButton = cancelButtonCreator.createUiButton();

        JPanel panel = new JPanel();
        panel.add(cancelButton.getButton());

        this.add(panel);
        this.setTitle("Cancelar Frame");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }
}