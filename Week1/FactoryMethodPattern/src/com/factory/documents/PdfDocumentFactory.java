package com.factory.documents;

public class PdfDocumentFactory extends DocumentFactory{
	@Override
	public Document createDocument() {
		return new PdfDocument();
	}
}
