package br.com.caio.padroes.comportamentais.observer;

public class ConcreteObserverB implements Observer {

    private int observedState;

    @Override
    public void update(int state) {
        observedState = state;
        System.out.println("Observer B: estado observado = " + observedState);
    }

    public int getObservedState() {
        return observedState;
    }
}