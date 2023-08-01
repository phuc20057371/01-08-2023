package org.example.state;

public class FeelingHappy implements Feel{
    @Override
    public void feeling() {
        System.out.println("i'm happy");
    }

    @Override
    public String feelName() {
        return "Happy";
    }
}
