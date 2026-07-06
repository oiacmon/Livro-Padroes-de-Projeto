package br.com.caio.padroes.comportamentais.state;

public class ConcreteStateA implements State {

    @Override
    public void handle(Context context) {
        System.out.println("Estado A: executando ação e mudando para B.");
        context.setState(new ConcreteStateB());
    }
}