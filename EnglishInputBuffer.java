package com.company;

/**
 * Class that manages the input of english characters.
 * Extends InputBuffer
 */
public class EnglishInputBuffer extends InputBuffer {

    /**
     * Variables to store the token received and which position we are translating.
     */
    private String currentToken;
    private int currentPosition;

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
        return new EnglishChar("a");
    }

    /**
     * Determines if the current input character is the end of a word.
     *
     * @return Returns true if we are at the end of a word.
     */
    public boolean isEndOfWord() {
        return true;
    }

    /**
     * Determines if the current input character is the end of a sentence.
     *
     * @return Returns true if we are at the end of a sentence.
     */
    public boolean isEndOfSentence() {
        return true;
    }
}
