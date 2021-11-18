package test.fmi.sp;

import java.util.ArrayList;
import java.util.List;

public class Grupa extends Element {
    private Element parent;
    private String nume;
    private List<Element> elements;

    public Grupa(String nume){
        this.nume = nume;
        this.elements = new ArrayList<>();
    }

    public Element getParent() {
        return parent;
    }

    public void setParent(Element parent) {
        this.parent = parent;
    }

    public Element add(Element element){
        this.elements.add(element);
        return this;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public List<Element> getElements() {
        return elements;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitGrupa(this);
    }
}
