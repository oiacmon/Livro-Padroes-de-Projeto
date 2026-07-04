package br.com.caio.padroes.comportamentais.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {

    private final List<Observer> observers = new ArrayList<>();
    private int state;

    public void setState(int state) {
        System.out.println("Subject: novo estado = " + state);
        this.state = state;
        notifyObservers();
    }

    public int getState() {
        return state;
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(state);
        }
    }
}