package br.com.caio.padroes.criacionais.FactoryMethod;

public class Main {
    public static void main(String[] args) {

        ConnectionFactory factory;

        factory = new MySQLConnectionFactory();
        factory.openConnection();

        factory = new PostgresConnectionFactory();
        factory.openConnection();
    }
}