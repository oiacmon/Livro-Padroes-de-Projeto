package br.com.caio.padroes.criacionais.FactoryMethod;

public class PostgresConnectionFactory extends ConnectionFactory {
    @Override
    public Connection createConnection() {
        return new PostgresConnection();
    }
}