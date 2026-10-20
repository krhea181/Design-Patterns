package com.abstractFactory;

public class WindowCheckBox implements CheckBox {
    @Override
    public void fetch() {
        System.out.println("Window checkbox is fetched!!");
    }
}
