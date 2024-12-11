package bai2;

import java.io.*;
import java.nio.file.NoSuchFileException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

class People {
    private String date, name, sdt;
    public People(String date, String name, String sdt) {
        this.date = date;
        this.name = name;
        this.sdt = sdt;
    }
    @Override
    public String toString(){
        return  name + ": " + sdt + " " + date;
    }
}
public class bai2 {
    public static void main (String[] args) throws FileNotFoundException, IOException, NoSuchElementException {
        Scanner sc = new Scanner(new File("SOTAY.txt"));
        FileWriter w = new FileWriter("DIENTHOAI.txt");
        BufferedWriter writer = new BufferedWriter(w);
        List<People> people = new ArrayList<>();
        while (sc.hasNext()) {
           String date = sc.nextLine();
           String name = sc.nextLine();
           String sdt = sc.nextLine();
           people.add(new People(date, name, sdt));

       }
        for (People i : people) {
            String s = i.toString();
            writer.write(s);

        }
    }
}
