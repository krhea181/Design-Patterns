package com.designPattern.Factory.DocType;

import com.designPatterns.factory.doctype.DocInterface;
import com.designPatterns.factory.doctype.WordDoc;

public class WordFactory implements DocFactoryInterface{
    @Override
    public DocInterface createDoc() {
        WordDoc word1 = new WordDoc();
        return  word1;
    }
}
