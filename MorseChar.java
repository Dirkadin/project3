package com.company;

public class MorseChar extends MsgChar{

    private String[] englishChars = "abcdefghijklmnopqrstuvwxyz".split("");
    private String[] morseChars = ".- -... -.-. -.. . ..-. --. .... .. .--- -.- .-.. -- -. --- .--. --.- .-. ... - ..- ...- .-- -..- -.-- --.. .-.-.- --..-- -...- .----. ..--..".split(" ");

    public MorseChar(String charValue) {
        super(charValue);
    }

    public String convert() {

        for (int i = 0; i < morseChars.length; i++) {
            if (this.getChar().equals(morseChars[i])) {
                return englishChars[i];
            }
        }
        return "---Broken in convert---";
    }
}
