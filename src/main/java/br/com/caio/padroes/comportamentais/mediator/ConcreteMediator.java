package br.com.caio.padroes.comportamentais.mediator;

public class ConcreteMediator implements Mediator {

    private ConcreteColleagueA colleagueA;
    private ConcreteColleagueB colleagueB;

    public void setColleagueA(ConcreteColleagueA colleagueA) {
        this.colleagueA = colleagueA;
    }

    public void setColleagueB(ConcreteColleagueB colleagueB) {
        this.colleagueB = colleagueB;
    }

    @Override
    public void notify(Colleague sender, String event) {
        if (sender == colleagueA && event.equals("A")) {
            System.out.println("Mediator: evento A recebido, notificando B.");
            colleagueB.react();
        } else if (sender == colleagueB && event.equals("B")) {
            System.out.println("Mediator: evento B recebido, notificando A.");
            colleagueA.react();
        }
    }
}