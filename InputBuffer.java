package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Reads the current message that is being translated from FileInputStream
// Determine which subclass to use by file type
public abstract class InputBuffer {

    private Scanner reader;
    private FileInputStream fileInputStream;

    InputBuffer(String inputFile) {

        try {
            fileInputStream = new FileInputStream(inputFile);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + inputFile);
            System.exit(-1);
        }



    }

    public boolean endOfBuffer() {
        return true;
    }

    public Scanner getReader() {
        reader = new Scanner(fileInputStream);
        return reader;
    }

    public void close() {
        try {
            fileInputStream.close();
        } catch (Exception e) {
            System.out.println("There was a problem closing the file: " + e);
            System.exit(-1);
        }
    }

    public abstract MsgChar getChar();
    public abstract boolean isEndOfWord();
    public abstract boolean isEndOfSentence();

}
