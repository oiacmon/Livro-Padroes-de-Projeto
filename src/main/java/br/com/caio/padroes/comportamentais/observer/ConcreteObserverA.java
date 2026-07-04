package br.com.caio.padroes.comportamentais.observer;

public class ConcreteObserverA implements Observer {

    private int observedState;

    @Override
    public void update(int state) {
        observedState = state;
        System.out.println("Observer A: estado observado = " + observedState);
    }

    public int getObservedState() {
        return observedState;
    }
}