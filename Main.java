package com.company;

public class Main {

	public static void main(String[] args)
	{
		Translator translator = new Translator("test.mor");
		translator.translate();

		Translator translator1 = new Translator("text.txt");
		translator1.translate();
	}
}
