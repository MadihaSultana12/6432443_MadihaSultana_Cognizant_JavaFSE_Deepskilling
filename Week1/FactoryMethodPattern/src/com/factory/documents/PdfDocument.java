package com.factory.documents;

public class PdfDocument implements Document{
	@Override
	public void open() {
		System.out.println("Pdf document is opening");
	}

}
