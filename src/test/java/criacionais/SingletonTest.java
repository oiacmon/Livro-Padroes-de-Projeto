package criacionais;

import br.com.caio.padroes.criacionais.singleton.Singleton;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SingletonTest {

    @Test
    void deveRetornarMesmaInstancia() {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        assertSame(s1, s2, "As instâncias devem ser iguais");
    }
}