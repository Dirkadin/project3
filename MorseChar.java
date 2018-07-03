package com.company;

/**
 * Represents a morse character.
 */
public class MorseChar extends MsgChar{

    /**
     * Variables that contain all characters to translate them.
     */
    private String[] englishChars = "abcdefghijklmnopqrstuvwxyz.,-'?".split("");
    private String[] morseChars = ".- -... -.-. -.. . ..-. --. .... .. .--- -.- .-.. -- -. --- .--. --.- .-. ... - ..- ...- .-- -..- -.-- --.. .-.-.- --..-- -...- .----. ..--..".split(" ");

    /**
     * Constructor for creating a morse character.
     *
     * @param charValue A morse character to be translated.
     */
    public MorseChar(String charValue) {
        super(charValue);
    }

    /**
     * Converts a morse character to english.
     *
     * @return Returns a english character.
     */
    public String convert() {

        for (int i = 0; i < morseChars.length; i++) {
            if (this.getChar().equals(morseChars[i])) {
                return englishChars[i];
            } else if (this.getChar().equals("")) {
                return " ";
            }
        }
        return "---Broken in convert---";
    }
}
