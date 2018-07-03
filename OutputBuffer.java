package com.company;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/**
 * Abstract class that represents output for the program.
 */
public abstract class OutputBuffer {

    /**
     * Variable for our ONE PrintWriter.
     */
    private PrintWriter writer = null;

    /**
     * Constructor for getting output.
     *
     * @param outputFile The filename of the file we want to translate.
     */
    public OutputBuffer(String outputFile) {

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(outputFile);
            writer = new PrintWriter(fileOutputStream);
        } catch (FileNotFoundException e) {
            System.out.println("Output file not found: " + e);
        }
    }

    /**
     * Gets the ONE writer for the rest of the program to pull from.
     *
     * @return Returns the ONE writer for the program.
     */
    public PrintWriter getWriter() {
        return writer;
    }

    /**
     * Closes the open PrintWriter file.
     */
    public void close() {

        try {
            writer.close();
        } catch (Exception e) {
            System.out.println("There was a problem closing the file: " + e);
            System.exit(-1);
        }
    }

    /**
     * Puts a new character that we need to translate.
     */
    public abstract void putChar(String charToWrite);

    /**
     * Provides the formatting for outputting the end of a word to the file.
     */
    public abstract void markEndOfWord();

    /**
     * Provides the formatting for outputting the end of a sentence to the file.
     */
    public abstract void markEndOfSentence();



}
