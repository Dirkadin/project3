package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Reads the current message that is being translated from FileInputStream
// Determine which subclass to use by file type
public abstract class InputBuffer {

    private Scanner reader = null;

    InputBuffer(String inputFile) {

        try {
            FileInputStream fileInputStream = new FileInputStream(inputFile);
            reader = new Scanner(fileInputStream);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + inputFile);
            System.exit(-1);
        }
    }

    public boolean endOfBuffer() {
        if (reader.hasNext()) {
            return false;
        } else {
            return true;
        }
    }

    public Scanner getReader() {
        return reader;
    }

    public void close() {
        try {
            reader.close();
        } catch (Exception e) {
            System.out.println("There was a problem closing the file: " + e);
            System.exit(-1);
        }
    }

    public abstract MsgChar getChar();
    public abstract boolean isEndOfWord();
    public abstract boolean isEndOfSentence();

}
