package com.company;

import java.util.Scanner;

/**
 * Class that manages the input of morse characters.
 * Extends InputBuffer
 */
public class MorseInputBuffer extends InputBuffer {

    /**
     * Variables to store the current and previous line.
     */
    private String previousLine = "";
    private String currentLine = "";

    /**
     * Constructor for getting English as input.
     *
     * @param inputFile The file that we will input from.
     */
    public MorseInputBuffer(String inputFile) {
        super(inputFile);
    }

    /**
     * Gets a new character that we need to translate.
     *
     * @return Returns a EnglishChar that we need to translate.
     */
    public MsgChar getChar() {

        Scanner scanner = this.getReader();

        previousLine = currentLine;

        MorseChar myChar = new MorseChar(scanner.nextLine());

        currentLine = myChar.toString();

        return myChar;
    }

    /**
     * Determines if the current input character is the end of a word.
     *
     * @return Returns true if we are at the end of a word.
     */
    public boolean isEndOfWord() {
        return currentLine.equals(" ");
    }

    /**
     * Determines if the current input character is the end of a sentence.
     *
     * @return Returns true if we are at the end of a sentence.
     */
    public boolean isEndOfSentence() {
        return previousLine.equals(".-.-.-") || previousLine.equals("..--..") && currentLine.equals(System.lineSeparator());
    }
}
