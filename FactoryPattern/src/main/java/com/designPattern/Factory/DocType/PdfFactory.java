package com.designPattern.Factory.DocType;

import com.designPatterns.factory.doctype.DocInterface;
import com.designPatterns.factory.doctype.PdfDoc;

public class PdfFactory implements DocFactoryInterface{

    @Override
    public DocInterface createDoc() {
        return new PdfDoc();
    }
}
