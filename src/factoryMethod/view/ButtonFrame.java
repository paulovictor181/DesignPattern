package factoryMethod.view;

import factoryMethod.ui.ButtonFactory;
import factoryMethod.ui.ButtonType;
import factoryMethod.ui.Interfaces.UiButton;

import javax.swing.*;

public class ButtonFrame extends JFrame {
    public ButtonFrame() {
        ButtonFactory factory = new ButtonFactory();

        UiButton confirmButtonCreator = factory.getButton(ButtonType.CONFIRMAR);
        UiButton cancelButtonCreator = factory.getButton(ButtonType.CANCELAR);

        JPanel panel = new JPanel();
        panel.add(confirmButtonCreator.createButton());
        panel.add(cancelButtonCreator.createButton());

        this.add(panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }
}