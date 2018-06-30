package com.company;

public class MorseInputBuffer extends InputBuffer {

    public MorseInputBuffer(String inputFile) {
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
