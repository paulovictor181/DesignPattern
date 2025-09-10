package factoryMethod.ui;

import factoryMethod.ui.Interfaces.UiButton;

import javax.swing.*;
import java.awt.*;

public class CancelButton implements UiButton {
    @Override
    public JButton createButton() {
        JButton button = new JButton("Cancel");
        button.setBackground(Color.RED);
        button.setOpaque(true);
        button.setBorderPainted(false);

        return button;
    }
}
