package com.company;

/**
 * Abstract class the represents a character.
 */
public abstract class MsgChar {
    private String charValue;

    /**
     * Constructor for an character.
     *
     * @param charValue The morse character to be converted.
     */
    public MsgChar(String charValue) {
        this.charValue = charValue;
    }

    public String getChar() {
        return this.charValue;
    }

    public abstract String convert();
}
