package com.designPatterns.factory.doctype;

import com.designPattern.Factory.DocType.DocFactoryInterface;
import com.designPattern.Factory.DocType.PdfFactory;
import com.designPattern.Factory.DocType.WordFactory;

import java.util.Scanner;

public class ClientBase {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the type of file you want");
        String input = scanner.nextLine();
        scanner.close();
        DocFactoryInterface factory = null;
        if(input.equalsIgnoreCase("PDF")){
            factory = new PdfFactory();
        }else if(input.equalsIgnoreCase("WORD")){
            factory = new WordFactory();
        }
        if(factory != null){
           DocInterface doc= factory.createDoc();
           doc.open();
        }
   }
}
