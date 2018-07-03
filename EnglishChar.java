package com.company;

/**
 * Class that represents a english character.
 * Extends MsgChar
 */
public class EnglishChar extends MsgChar {

    /**
     * Variables that contain all characters to translate them.
     */
    private String[] englishChars = "abcdefghijklmnopqrstuvwxyz.,-'?".split("");
    private String[] morseChars = ".- -... -.-. -.. . ..-. --. .... .. .--- -.- .-.. -- -. --- .--. --.- .-. ... - ..- ...- .-- -..- -.-- --.. .-.-.- --..-- -...- .----. ..--..".split(" ");

    /**
     * Constructor for an EnglishCharacter.
     *
     * @param charValue The morse character to be converted.
     */
    public EnglishChar(String charValue) {
        super(charValue);
    }

    /**
     * Converts a english char to a morse char.
     *
     * @return Returns a single morse character converted from morse code.
     */
    public String convert() {

        return "";
    }
}
