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
    private String currentToken = "";
    private int currentPosition = 0;
    private boolean resetToken = true;

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

        if (resetToken) {
            currentToken = scanner.next();
            currentPosition = 0;
            resetToken = false;
        }

        if (currentToken.length() - 1 == currentPosition) {
            String[] toReturnArray = currentToken.split("");
            resetToken = true;
            return new EnglishChar(toReturnArray[currentPosition]);
        }

        String[] toReturnArray = currentToken.split("");
        String toReturn = toReturnArray[currentPosition];

        currentPosition ++;

        return new EnglishChar(toReturn);
    }

    /**
     * Determines if the current input character is the end of a word.
     *
     * @return Returns true if we are at the end of a word.
     */
    public boolean isEndOfWord() {
        return resetToken;
    }

    /**
     * Determines if the current input character is the end of a sentence.
     *
     * @return Returns true if we are at the end of a sentence.
     */
    public boolean isEndOfSentence() {
        String[] toReturnArray = currentToken.split("");

        if (toReturnArray[currentToken.length() - 1].equals(".") || toReturnArray[currentToken.length() - 1].equals("?")) {
            return currentToken.length() - 1 == currentPosition;
        }
        return false;
    }
}
