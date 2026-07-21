package br.com.caio.padroes.comportamentais.visitor;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {

    private final List<Element> elements = new ArrayList<>();

    public void add(Element element) {
        elements.add(element);
    }

    public void applyVisitor(Visitor visitor) {
        for (Element e : elements) {
            e.accept(visitor);
        }
    }
}