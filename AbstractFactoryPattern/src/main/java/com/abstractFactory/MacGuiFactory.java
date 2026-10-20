package com.abstractFactory;

public class MacGuiFactory implements GuiFactory {

    @Override
    public Button createButton() {
        Button button = new MacButton();
        return button;
    }

    @Override
    public CheckBox createCheckbox() {
        CheckBox checkbox = new MacCheckBox();
        return checkbox;
    }
}
