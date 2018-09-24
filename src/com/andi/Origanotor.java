package com.andi;

public class Origanotor {

    // this string is just to simplify - usually actual java class
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMemento() {
        return new Memento(state);
    }

    public void setMomento(Memento memento ){
        state = memento.getState();
    }
}
