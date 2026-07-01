package br.com.caio.padroes.comportamentais.mediator;

public class ConcreteColleagueB extends Colleague {

    public ConcreteColleagueB(Mediator mediator) {
        super(mediator);
    }

    public void actionB() {
        System.out.println("Colleague B executou ação B.");
        sendEvent("B");
    }

    public void react() {
        System.out.println("Colleague B reagiu ao evento.");
    }
}