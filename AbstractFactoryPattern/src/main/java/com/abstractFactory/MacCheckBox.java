package com.abstractFactory;

public class MacCheckBox implements CheckBox {
    @Override
    public void fetch() {
        System.out.println("Mac checkbox is fetched!!");
    }
}
