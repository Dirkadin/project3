package com.company;

public abstract class MsgChar {
    private String charValue;

    public MsgChar(String charValue) {
        this.charValue = charValue;
    }

    public String getChar() {
        return this.charValue;
    }

    public abstract String convert();
}
