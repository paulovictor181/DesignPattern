package singleton;

import singleton.view.CancelFrame;
import singleton.view.ConfirmFrame;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ConfirmFrame();
            new CancelFrame();
        });
    }
}
