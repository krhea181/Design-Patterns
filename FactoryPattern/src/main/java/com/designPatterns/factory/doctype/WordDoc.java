package com.designPatterns.factory.doctype;

public class WordDoc implements DocInterface{
    @Override
    public void open() {
        System.out.println("Word Doc reader!!");
    }
}


