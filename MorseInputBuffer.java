package com.company;

import java.util.Scanner;

public class MorseInputBuffer extends InputBuffer {

    private String previousLine = "";
    private String currentLine = "";
//    private Scanner scanner = this.getReader();
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

        return false;
    }

    public boolean isEndOfSentence() {

        if (currentLine.equals(".-.-.-") || currentLine.equals("..--..")) {
            return true;
        }

        return false;
    }
}
