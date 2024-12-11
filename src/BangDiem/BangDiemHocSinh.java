package BangDiem;

import java.util.*;

class studentScore {
    private static int id = 1;
    String codeStudent, name;
    double math, vietnamese, english, physics, chemistry, bio, history, geo, edu, tech;
    public studentScore(String name,
                        double math, double vietnamese, double english, double physics, double chemistry, double bio, double history, double geo, double edu, double tech){
        this.codeStudent = String.format("HS%02d", id++);
        this.name = name;
        this.math = math;
        this.vietnamese = vietnamese;
        this.english = english;
        this.physics = physics;
        this.chemistry = chemistry;
        this.bio = bio;
        this.history = history;
        this.geo = geo;
        this.edu = edu;
        this.tech = tech;
    }
    public double getAvarage(){
        double total = math * 2 + vietnamese * 2 + english + physics + chemistry + bio + history + geo + edu + tech;
        double average = total / 12;
        return Math.ceil(average * 100) / 100.0;
    }
    @Override
    public String toString(){
        String temp = "";
        if(getAvarage() >= 9.0){
            temp = "XUAT SAC";
        } else if (getAvarage() >= 8.0 && getAvarage() <= 8.9) {
            temp = "GIOI";
        } else if (getAvarage() >= 7.0 && getAvarage() <= 7.9) {
            temp = "KHA";
        } else if (getAvarage() >= 5.0 && getAvarage() <= 6.9) {
            temp = "TB";
        } else if (getAvarage() < 5) {
            temp = "YEU";
        }
        return codeStudent + " " + name + " " + String.format("%.1f", getAvarage()) +" " + temp;
    }

}
public class BangDiemHocSinh {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        List<studentScore> students = new ArrayList<>();
        while (T-- >0){
            double[] a = new double[10];
            String name = sc.nextLine();
            String[] lines = sc.nextLine().split("\\s+");
            for (int i = 0; i < 10; i++) {
                a[i] = Double.parseDouble(lines[i]);
            }
            students.add(new studentScore(name, a[0], a[1], a[2], a[3], a[4], a[5], a[6], a[7], a[8], a[9]));
        }
        Collections.sort(students, new Comparator<studentScore>() {
            @Override
            public int compare(studentScore o1, studentScore o2) {
                return Double.compare(o2.getAvarage(), o1.getAvarage()) ;
            }
        });
        for (studentScore s : students){
            System.out.println(s);
        }
    }
}
