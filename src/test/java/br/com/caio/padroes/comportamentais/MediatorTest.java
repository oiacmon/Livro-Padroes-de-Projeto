package br.com.caio.padroes.comportamentais;

import br.com.caio.padroes.comportamentais.mediator.ConcreteColleagueA;
import br.com.caio.padroes.comportamentais.mediator.ConcreteColleagueB;
import br.com.caio.padroes.comportamentais.mediator.ConcreteMediator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MediatorTest {

    @Test
    void deveCoordenarInteracaoEntreColegas() {
        ConcreteMediator mediator = new ConcreteMediator();

        ConcreteColleagueA a = new ConcreteColleagueA(mediator);
        ConcreteColleagueB b = new ConcreteColleagueB(mediator);

        mediator.setColleagueA(a);
        mediator.setColleagueB(b);

        assertDoesNotThrow(a::actionA);
        assertDoesNotThrow(b::actionB);
    }
}