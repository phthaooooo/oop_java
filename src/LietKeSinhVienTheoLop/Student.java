package LietKeSinhVienTheoLop;

import com.sun.source.tree.BreakTree;

public class Student {
    private String code, name, cLass, email;
    public Student (String code, String name, String cLass, String email) {
        this.code = code;
        this.name = name;
        this.cLass = cLass;
        this.email = email;
    }

    public String getcLass() {
        return cLass;
    }

    @Override
    public String toString() {
        return code + " " + name + " " + cLass + " " + email;
    }
}
