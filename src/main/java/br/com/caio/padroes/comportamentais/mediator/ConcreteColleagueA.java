package br.com.caio.padroes.comportamentais.mediator;

public class ConcreteColleagueA extends Colleague {

    public ConcreteColleagueA(Mediator mediator) {
        super(mediator);
    }

    public void actionA() {
        System.out.println("Colleague A executou ação A.");
        sendEvent("A");
    }

    public void react() {
        System.out.println("Colleague A reagiu ao evento.");
    }
}