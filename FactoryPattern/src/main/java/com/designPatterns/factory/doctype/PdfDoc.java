package com.designPatterns.factory.doctype;

public class PdfDoc implements DocInterface{
    @Override
    public void open(){
        System.out.println("Pdf Doc Reader!!");
    }
}
