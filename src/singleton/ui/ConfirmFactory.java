package singleton.ui;

import singleton.ui.Interfaces.UiButton;
import singleton.ui.Interfaces.UiFactory;

public class ConfirmFactory implements UiFactory {

    private static ConfirmFactory instance;

    private ConfirmFactory() {
    }

    public static synchronized ConfirmFactory getInstance() {
        if (instance == null) {
            instance = new ConfirmFactory();
        }
        return instance;
    }

    @Override
    public UiButton createUiButton() {
        return new ConfirmButton();
    }
}
