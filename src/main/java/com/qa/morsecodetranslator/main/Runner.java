package com.qa.morsecodetranslator.main;

public class Runner {
    public static void main(String[] args) {
        MorseTranslator translator = new MorseTranslator();
        System.out.println(translator.translate(".--- .- ...- .- / .. ... / -.-. --- --- .-.. / --- -.-"));
    }
}
