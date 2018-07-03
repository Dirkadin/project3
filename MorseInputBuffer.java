package com.company;

import java.util.Scanner;

public class MorseInputBuffer extends InputBuffer {

    private String previousLine = "";
    private String currentLine = "";

    public MorseInputBuffer(String inputFile) {
        super(inputFile);
    }

    public MsgChar getChar() {

        Scanner scanner = this.getReader();

        previousLine = currentLine;

        MorseChar myChar = new MorseChar(scanner.nextLine());

        currentLine = myChar.toString();

        return myChar;
    }

    public boolean isEndOfWord() {
        return currentLine.equals(" ");
    }

    public boolean isEndOfSentence() {
        return previousLine.equals(".-.-.-") || previousLine.equals("..--..") && currentLine.equals(System.lineSeparator());
    }
}
