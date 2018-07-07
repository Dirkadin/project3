package com.company;

/**
 * Class that manages the output of english characters.
 *
 * Extends OutputBuffer
 */
public class MorseOutputBuffer extends OutputBuffer {

    /**
     * Constructor for creating a english output buffer.
     *
     * @param outputFile The filename of the output file.
     */
    public MorseOutputBuffer(String outputFile) {
        super(outputFile);
    }

    /**
     * Writes a character to a file
     *
     * @param charToWrite Character to write to the file.
     */
    public void putChar(String charToWrite) {
        if (charToWrite.equals(System.lineSeparator())) {
            this.getWriter().print(System.lineSeparator());
            System.out.print(System.lineSeparator());
        } else if (charToWrite.equals(System.lineSeparator() + System.lineSeparator())) {
            this.getWriter().print(System.lineSeparator() + System.lineSeparator());
            System.out.print(System.lineSeparator() + System.lineSeparator());
        } else {
            this.getWriter().print(charToWrite);
            this.getWriter().print(System.lineSeparator());
            System.out.print(charToWrite);
            System.out.print(System.lineSeparator());
        }


    }

    /**
     * Provides the formatting for outputting the end of a word to the file.
     */
    public void markEndOfWord() {
        putChar(System.lineSeparator());
    }

    /**
     * Provides the formatting for outputting the end of a sentence to the file.
     */
    public void markEndOfSentence() {
        putChar(System.lineSeparator() + System.lineSeparator());
    }
}
