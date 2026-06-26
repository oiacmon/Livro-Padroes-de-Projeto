package br.com.caio.padroes.estruturais.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

    private Map<Character, Flyweight> pool = new HashMap<>();

    public Flyweight getFlyweight(char key) {
        if (!pool.containsKey(key)) {
            pool.put(key, new ConcreteFlyweight(key));
        }
        return pool.get(key);
    }

    public int poolSize() {
        return pool.size();
    }
}