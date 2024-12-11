import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Student1 implements Comparable<Student1> {
    String code, name, phone;
    int order;
    String ex;

    public Student1(String code, String name, String phone, int order){
        this.code = code;
        this.name = name;
        this.phone = phone;
        this.order = order;
    }

    public void setCode(String code){
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public int getOrder() {
        return order;
    }

    public void setEx(String ex) {
        this.ex = ex;
    }

    public String getEx() {
        return ex;
    }

    @Override
    public String toString(){

        return code + " " + name + " " + phone + " " + order + " " + getEx();
    }

    @Override
    public int compareTo(Student1 o){
        return code.compareTo(o.code);
    }
}

public class QuanLyBaiTapNhom2 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        String[] a = sc.nextLine().split(" ");
        int t = Integer.parseInt(a[0]);
        int g = Integer.parseInt(a[1]);
        ArrayList<Student1> s = new ArrayList<>(t);
        while(t-- >0){
            s.add(new Student1(sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        ArrayList<String> str = new ArrayList<>();
        while(g-- >0)

        {
            str.add(sc.nextLine());

        }
        for (Student1 s1 : s){
            s1.setEx(str.get(s1.getOrder() - 1));
        }
        Collections.sort(s);
        for(Student1 s2 : s){
            System.out.println(s2);
        }

    }
}
