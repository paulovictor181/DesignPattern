package singleton.ui;

import singleton.ui.Interfaces.UiButton;
import singleton.ui.Interfaces.UiFactory;

public class CancelFactory implements UiFactory {

    private static CancelFactory instance;

    private CancelFactory() {
    }

    public static synchronized CancelFactory getInstance() {
        if (instance == null) {
            instance = new CancelFactory();
        }
        return instance;
    }

    @Override
    public UiButton createUiButton() {
        return new CancelButton();
    }
}
