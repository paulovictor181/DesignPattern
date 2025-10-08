package factoryMethod.view;

import factoryMethod.ui.*;
import factoryMethod.ui.Interfaces.UiButton;
import factoryMethod.ui.Interfaces.UiFactory;

import javax.swing.*;

public class ButtonFrame extends JFrame {
    public ButtonFrame() {
        UiFactory confirmButtonCreator = new ConfirmFactory();
        UiFactory cancelButtonCreator = new CancelFactory();
        UiFactory infoButtonCreator = new InfoFactory();


        UiButton confirmButton = confirmButtonCreator.createUiButton();
        UiButton cancelButton = cancelButtonCreator.createUiButton();
        UiButton infoButton =  infoButtonCreator.createUiButton();


        JPanel panel = new JPanel();
        panel.add(confirmButton.getButton());
        panel.add(cancelButton.getButton());
        panel.add(infoButton.getButton());


        this.add(panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }
}