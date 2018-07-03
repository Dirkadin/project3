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

    }

    /**
     * Provides the formatting for outputting the end of a word to the file.
     */
    public void markEndOfWord() {

    }

    /**
     * Provides the formatting for outputting the end of a sentence to the file.
     */
    public void markEndOfSentence() {

    }
}
