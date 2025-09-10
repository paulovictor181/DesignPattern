package factoryMethod.ui;

import factoryMethod.ui.Interfaces.UiButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConfirmButton implements UiButton {
    @Override
    public JButton getButton() {
        JButton button = new JButton("Confirmar");
        button.setBackground(Color.GREEN);
        button.setOpaque(true);
        button.setBorderPainted(false);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Confirm button clicked");
            }
        });

        return button;
    }
}
