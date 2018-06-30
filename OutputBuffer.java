package com.company;

import java.io.PrintWriter;

public abstract class OutputBuffer {

    private PrintWriter writer;

    public OutputBuffer(String outputFile) {

    }

    public PrintWriter getWriter() {
        return writer;
    }

    public void close() {

    }

    public abstract void putChar(String charToWrite);
    public abstract void markEndOfWord();
    public abstract void markEndOfSentence();



}
