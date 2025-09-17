package factoryMethod.ui;

import factoryMethod.ui.Interfaces.UiButton;
import factoryMethod.ui.Interfaces.UiFactory;
import factoryMethod.ui.CancelButton;


public class CancelFactory implements UiFactory {
    @Override
    public UiButton createUiButton() {
        return new CancelButton();
    }
}
