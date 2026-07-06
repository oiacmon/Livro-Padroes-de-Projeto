package br.com.caio.padroes.comportamentais.state;

public class Context {

    private State state;

    public Context(State state) {
        this.state = state;
    }

    public void setState(State state) {
        System.out.println("Contexto: novo estado = " + state.getClass().getSimpleName());
        this.state = state;
    }

    public void request() {
        state.handle(this);
    }
}