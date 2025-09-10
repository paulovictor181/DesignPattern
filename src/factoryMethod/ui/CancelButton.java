package factoryMethod.ui;

import factoryMethod.ui.Interfaces.UiButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CancelButton implements UiButton {
    @Override
    public JButton getButton() {
        JButton button = new JButton("Cancel");
        button.setBackground(Color.RED);
        button.setOpaque(true);
        button.setBorderPainted(false);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Cancel button clicked");
            }
        });

        return button;
    }
}
