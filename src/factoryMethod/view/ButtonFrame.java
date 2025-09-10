package factoryMethod.view;

import factoryMethod.ui.*;
import factoryMethod.ui.Interfaces.UiButton;
import factoryMethod.ui.Interfaces.UiFactory;

import javax.swing.*;

public class ButtonFrame extends JFrame {
    public ButtonFrame() {
        UiFactory confirmButtonCreator = new ConfirmFactory();
        UiFactory cancelButtonCreator = new CancelFactory();

        UiButton confirmButton = confirmButtonCreator.createUiButton();
        UiButton cancelButton = cancelButtonCreator.createUiButton();

        JPanel panel = new JPanel();
        panel.add(confirmButton.getButton());
        panel.add(cancelButton.getButton());

        this.add(panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }
}