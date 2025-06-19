package com.factory.documents;

public class WordDocument implements Document{
	@Override
	public void open() {
		System.out.println("Word document is opening");
		}

}
