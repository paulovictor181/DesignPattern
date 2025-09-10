package factoryMethod.ui;

import factoryMethod.ui.Interfaces.UiButton;

public class ButtonFactory {
    public UiButton getButton(ButtonType type){
        return type.create();
    }
}
