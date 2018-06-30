package com.company;

import java.util.Scanner;

// Coordinates the translation of messages from one language to the other
public class Translator {

    private boolean toMorse;

    private InputBuffer input;
    private OutputBuffer output;


    public Translator(String inputFile) {

        // Determining if we are translating to morse or not
        int fileNameLength = inputFile.length();
        String extension = inputFile.substring(fileNameLength - 3);
        System.out.println(extension);
        switch (extension) {
            case "mor":
                System.out.println("Translating to English");
                toMorse = false;
                break;
            case "txt":
                System.out.println("Translating to Morse");
                toMorse = true;
                break;
            default:
                System.out.println("The file type provided is not supported!");
                System.exit(-1);
                break;
        }

        if (toMorse) {
            input = new EnglishInputBuffer(inputFile);
            output = new MorseOutputBuffer("output.mor");
            System.out.println("Got here");
        } else if (!toMorse) {
            input = new MorseInputBuffer(inputFile);
            output = new EnglishOutputBuffer("output.txt");
        }
    }

    public void translate() {
        // Read current MsgChar from InputBuffer using convert method
        Scanner scanner = input.getReader();


        // Then send to OutputBuffer
        // When end of word or sentence is found call the opposite mark end
        // Sent to morse code player to play
    }
}
