package br.com.caio.padroes.criacionais.FactoryMethod;

public abstract class ConnectionFactory {

    public abstract Connection createConnection();

    public void openConnection() {
        Connection conn = createConnection();
        conn.connect();
    }
}