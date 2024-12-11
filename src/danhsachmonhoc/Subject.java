package danhsachmonhoc;

import java.io.Serializable;

public class Subject implements Serializable {
    private String codeSubject, name;
    private int amount;
    public Subject(String codeSubject, String name, int amount) {
        this.codeSubject = codeSubject;
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return codeSubject + " " + name + " " + amount;
    }
}
