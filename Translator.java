package com.company;

/**
 * This class coordinates the translation of messages.
 */
public class Translator {

    /**
     * Indicates if we are translating to or from morse.
     */
    private boolean toMorse;

    /**
     * Input and output streams for processing data.
     */
    private InputBuffer input;
    private OutputBuffer output;


    /**
     * Creates a instance of the translator class.
     * The translator is where the bulk of the work happens.
     *
     * @param inputFile The filename of the file you wish to translate.
     */
    public Translator(String inputFile) {

        // Determining if we are translating to morse or not
        int fileNameLength = inputFile.length();
        String extension = inputFile.substring(fileNameLength - 3);
        switch (extension) {
            case "mor":
                System.out.println("Translating to English");
                toMorse = false;
                break;
            case "eng":
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
        } else if (!toMorse) {
            input = new MorseInputBuffer(inputFile);
            output = new EnglishOutputBuffer("output.eng");
        }
    }

    /**
     * Handles the translation of files.  Input and output.
     */
    public void translate() {
        do {
            String stringInput = input.getChar().convert();

            if (input.isEndOfSentence() ) {
                output.markEndOfWord();
            } else if (input.isEndOfSentence()) {
                output.markEndOfSentence();
            } else {
                output.putChar(stringInput);
            }

        } while (!input.endOfBuffer());

        input.close();
        output.close();
    }
}
