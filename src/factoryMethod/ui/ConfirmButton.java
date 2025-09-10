package factoryMethod.ui;

import factoryMethod.ui.Interfaces.UiButton;

import javax.swing.*;
import java.awt.*;

public class ConfirmButton implements UiButton {
    @Override
    public JButton createButton() {
        JButton button = new JButton("Confirmar");
        button.setBackground(Color.GREEN);
        button.setOpaque(true);
        button.setBorderPainted(false);

        return button;
    }
}
