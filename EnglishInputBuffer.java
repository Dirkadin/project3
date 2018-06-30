package com.company;

public class EnglishInputBuffer extends InputBuffer {

    private String currentToken;
    private int currentPosition;

    public EnglishInputBuffer(String inputFile) {
        super(inputFile);
    }

    public MsgChar getChar() {
        return new EnglishChar("a");
    }

    public boolean isEndOfWord() {
        return true;
    }

    public boolean isEndOfSentence() {
        return true;
    }
}
