package org.example;

import org.example.state.FeelingHappy;
import org.example.state.FeelingSad;
import org.example.state.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFeel(new FeelingHappy());
        person.applyFeel();

        person.setFeel(new FeelingSad());
        person.applyFeel();
    }
}