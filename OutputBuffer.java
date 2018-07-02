package com.company;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public abstract class OutputBuffer {

    private PrintWriter writer = null;

    public OutputBuffer(String outputFile) {

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(outputFile);
            writer = new PrintWriter(fileOutputStream);
        } catch (FileNotFoundException e) {
            System.out.println("Output file not found: " + e);
        }
    }

    public PrintWriter getWriter() {
        return writer;
    }

    public void close() {

        try {
            writer.close();
        } catch (Exception e) {
            System.out.println("There was a problem closing the file: " + e);
            System.exit(-1);
        }
    }

    public abstract void putChar(String charToWrite);
    public abstract void markEndOfWord();
    public abstract void markEndOfSentence();



}
