package com.abstractFactory;

import java.util.Scanner;

public class ClientBase {
    public static void main(String[] args){
        System.out.println("Enter the type of os system you have!!");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        GuiFactory guiFactory = null;
        if(input.equalsIgnoreCase("Mac")){
            guiFactory = new MacGuiFactory();
        }else if(input.equalsIgnoreCase("Window")){
            guiFactory = new WindowGuiFactory();
        }

        if(guiFactory != null) {
            guiFactory.createButton().render();
            guiFactory.createCheckbox().fetch();
        }
    }
}
