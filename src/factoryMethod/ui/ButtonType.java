package factoryMethod.ui;

import factoryMethod.ui.Interfaces.UiButton;

public enum ButtonType {
    CONFIRMAR {
        @Override
        public UiButton create() {
            return new ConfirmButton();
        }
    },
    CANCELAR {
        @Override
        public UiButton create() {
            return new CancelButton();
        }
    };

    public abstract UiButton create();
}