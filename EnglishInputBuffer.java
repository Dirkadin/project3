package com.company;

import java.util.Scanner;

/**
 * Class that manages the input of english characters.
 * Extends InputBuffer
 */
public class EnglishInputBuffer extends InputBuffer {

    /**
     * Variables to store the token received and which position we are translating.
     */
    private String currentToken = null;
    private int currentPosition = 0;

    /**
     * Constructor for getting English as input.
     *
     * @param inputFile The file that we will input from.
     */
    public EnglishInputBuffer(String inputFile) {
        super(inputFile);
    }

    /**
     * Gets a new character that we need to translate.
     *
     * @return Returns a EnglishChar that we need to translate.
     */
    public MsgChar getChar() {

        Scanner scanner = this.getReader();

        if (currentToken == null) {
            currentToken = scanner.next();
        }

        // I'm having trouble here printing a space when I need to.
        if (currentPosition < currentToken.length()) {
            if (this.isEndOfWord()) {
                String toReturn = "" + currentToken.toCharArray()[currentPosition] + " ";
                currentPosition ++;
                return new EnglishChar(toReturn);
            } else if (this.isEndOfSentence() && currentToken.length() - 1 == currentPosition) {
                String toReturn = "" + currentToken.toCharArray()[currentPosition] + "\n";
                currentPosition ++;
                return new EnglishChar(toReturn);
            }
            String toReturn = "" + currentToken.toCharArray()[currentPosition];
            currentPosition ++;
            return new EnglishChar(toReturn);
        } else {
            currentToken = scanner.next();
            currentPosition = 0;
            return new EnglishChar("" + currentToken.toCharArray()[currentPosition]);
        }
    }

    /**
     * Determines if the current input character is the end of a word.
     *
     * @return Returns true if we are at the end of a word.
     */
    public boolean isEndOfWord() {
        if (currentPosition == currentToken.length() - 1) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Determines if the current input character is the end of a sentence.
     *
     * @return Returns true if we are at the end of a sentence.
     */
    public boolean isEndOfSentence() {

        String endChar = "" + currentToken.toCharArray()[currentToken.length() - 1];

        if (endChar.equals(".") || endChar.equals("?")) {
            return true;
        } else {
            return false;
        }

    }
}
