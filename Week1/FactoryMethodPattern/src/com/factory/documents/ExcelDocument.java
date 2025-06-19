package com.factory.documents;

public class ExcelDocument implements Document{
	@Override
    public void open() {
		System.out.println("Excel document is opening");
	}
}
