package com.andi;

public class Main {

    public static void main(String[] args) {

        Origanotor origanotor = new Origanotor();
        origanotor.setState("Monster");

        Memento memento = origanotor.createMemento();

        CareTaker careTaker = new CareTaker();
        careTaker.addMemento(memento);

        origanotor.setState("Monster 2");
        origanotor.setState("Monster 3");

        memento = origanotor.createMemento();
        careTaker.addMemento(memento);

        origanotor.setState("Monster 4");

        System.out.println("Originator current state: " + origanotor.getState());
        System.out.println("Originator restoring to previous state ...");

        memento = careTaker.getMemento(1);
        origanotor.setMomento(memento);

        System.out.println("Originator current state: " + origanotor.getState());
        memento = careTaker.getMemento(0);
        origanotor.setMomento(memento);

        System.out.println("Originator current state: " + origanotor.getState());


    }
}
