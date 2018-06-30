package com.company;

public class EnglishOutputBuffer extends OutputBuffer {

    public EnglishOutputBuffer(String outputFile) {
        super(outputFile);
    }

    public void putChar(String charToWrite) {
        System.out.println(charToWrite);
    }


    // Mark methods will handle formatting of the output.
    public void markEndOfWord() {

    }

    public void markEndOfSentence() {

    }
}
