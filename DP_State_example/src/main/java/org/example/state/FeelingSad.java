package org.example.state;

public class FeelingSad implements Feel{
    @Override
    public void feeling() {
        System.out.println("i'm sad");
    }

    @Override
    public String feelName() {
        return "Sad";
    }
}
