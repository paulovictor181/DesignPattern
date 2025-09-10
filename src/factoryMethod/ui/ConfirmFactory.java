package factoryMethod.ui;

import factoryMethod.ui.Interfaces.UiButton;
import factoryMethod.ui.Interfaces.UiFactory;

public class ConfirmFactory implements UiFactory {
    @Override
    public UiButton createUiButton() {
        return new ConfirmButton();
    }
}
