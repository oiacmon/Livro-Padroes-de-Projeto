package br.com.caio.padroes.comportamentais.state;

public class ConcreteStateB implements State {

    @Override
    public void handle(Context context) {
        System.out.println("Estado B: executando ação e mudando para A.");
        context.setState(new ConcreteStateA());
    }
}