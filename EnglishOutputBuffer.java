package com.company;

import java.io.FileOutputStream;
import java.io.PrintWriter;

public class EnglishOutputBuffer extends OutputBuffer {

    private FileOutputStream outputStream = null;
    private PrintWriter outFS = null;

    public EnglishOutputBuffer(String outputFile) {
        super(outputFile);
    }

    public void putChar(String charToWrite) {

        System.out.print(charToWrite);
    }


    // Mark methods will handle formatting of the output.
    public void markEndOfWord() {
        // space character
        putChar(" ");

    }

    public void markEndOfSentence() {
        // new line character
        putChar(System.lineSeparator());
    }
}
