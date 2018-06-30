package com.company;

import java.util.Scanner;

public class MorseInputBuffer extends InputBuffer {

    private String previousLine = "";
    private String currentLine = "";

    public MorseInputBuffer(String inputFile) {
        super(inputFile);
    }

    public MsgChar getChar() {

        previousLine = currentLine;

        Scanner scanner = this.getReader();

        MorseChar myChar = new MorseChar(scanner.nextLine());

        currentLine = myChar.toString();

        return myChar;
    }

    public boolean isEndOfWord() {

        if (currentLine.isEmpty()) {
            return true;
        }

        return false;
    }

    public boolean isEndOfSentence() {

        if (currentLine.equals(".-.-.-") || currentLine.equals("..--..")) {
            return true;
        }

        return false;
    }
}
