package com.Other.Polymorfizm.Greating;

public class UseLanguage {
    public static void main (String[] args) {
        Language l = new Language();
        l.greating();
        l = new English();
        l.greating();
        l = new Nepali();
        l.greating();
        l = new Spanish();
        l.greating();
        l = new German();
        l.greating();

    }
}
