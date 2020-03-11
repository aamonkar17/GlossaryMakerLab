package com.company;

public class Main {

    public static void main(String[] args) {
        GlossaryEntry ge = new GlossaryEntry("Hello");
        ge.add(5);
        ge.add(7);
        ge.add(5);
        ge.add(12);
        System.out.println(ge);
    }
}
