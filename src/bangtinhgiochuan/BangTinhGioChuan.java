package bangtinhgiochuan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Subject {
    private String code, name;
    public Subject(String code, String name){
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
class Lecturer {
    private String code, name;
    private float hours = 0;
    public Lecturer(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHours() {
        return hours;
    }

    public void setHours(float hours) {
        this.hours = hours;
    }
    @Override
    public String toString(){
        return getName() + " " + String.format("%.2f", getHours());
    }
}
class DS {
    private String codeS, codeL, nameL;
    private float hours;
    public DS(String codeL, String codeS, float hours) {
        this.codeS = codeS;
        this.codeL = codeL;
        this.hours = hours;
    }

    public String getCodeL() {
        return codeL;
    }

    public void setCodeL(String codeL) {
        this.codeL = codeL;
    }

    public String getCodeS() {
        return codeS;
    }

    public void setCodeS(String codeS) {
        this.codeS = codeS;
    }

    public float getHours() {
        return hours;
    }

    public void setHours(float hours) {
        this.hours = hours;
    }

    public String getNameL() {
        return nameL;
    }

    public void setNameL(String nameL) {
        this.nameL = nameL;
    }

}
public class BangTinhGioChuan {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        int soMH = Integer.parseInt(sc.nextLine());
        List<Subject> subjects = new ArrayList<>();
        while(soMH-- >0){
            String[] temp = sc.nextLine().split(" ", 2);
            subjects.add(new Subject(temp[0], temp[1]));
        }
        int soL = Integer.parseInt(sc.nextLine());
        List<Lecturer> lecturers = new ArrayList<>();
        while (soL-- >0) {
            String[] tmp = sc.nextLine().split(" ", 2);
            lecturers.add(new Lecturer(tmp[0], tmp[1]));
        }
        int soDS = Integer.parseInt(sc.nextLine());
        List<DS> ds = new ArrayList<>();
        while (soDS-- >0){
            String[] tmp = sc.nextLine().split(" ");
            ds.add(new DS(tmp[0], tmp[1], Float.parseFloat(tmp[2])));
        }
        for (Lecturer l : lecturers){

            for (DS d : ds) {
                if(l.getCode().equals(d.getCodeL())){
                    l.setHours(l.getHours() + d.getHours());
                    //d.setNameL(l.getName());
                }
            }
        }
        for (Lecturer i : lecturers){
            System.out.println(i);
        }
    }
}
