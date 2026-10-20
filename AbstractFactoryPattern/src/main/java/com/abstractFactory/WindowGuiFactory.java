package com.abstractFactory;

public class WindowGuiFactory implements GuiFactory {
    @Override
    public Button createButton(){
        Button button = new WindowButton();
        return button;
    }

    @Override
    public CheckBox createCheckbox() {
        CheckBox checkBox = new WindowCheckBox();
        return checkBox;
    }
}
