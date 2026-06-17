package br.com.caio.padroes.criacionais.FactoryMethod;

public class MySQLConnectionFactory extends ConnectionFactory {
    @Override
    public Connection createConnection() {
        return new MySQLConnection();
    }
}