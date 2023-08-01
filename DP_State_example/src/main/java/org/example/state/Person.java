package org.example.state;

public class Person {
    private Feel feel;

    public void setFeel(Feel feel){
        this.feel = feel;
    }
    public void applyFeel(){
        this.feel.feeling();
    }
}
