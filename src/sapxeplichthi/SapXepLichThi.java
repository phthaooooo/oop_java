package sapxeplichthi;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class SapXepLichThi {
    public static void main (String[] args) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new File("MONTHI.in"));
        Scanner sc2 = new Scanner(new File("CATHI.in"));
        Scanner sc3 = new Scanner(new File("LICHTHI.in"));

        int MT = Integer.parseInt(sc1.nextLine());
        List<Subject> subjects = new ArrayList<>();
        while (MT-- >0) {
            subjects.add(new Subject(sc1.nextLine(), sc1.nextLine(), sc1.nextLine()));
        }
        int CT = Integer.parseInt(sc2.nextLine());
        List<CaThi> caThiList = new ArrayList<>();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
        while (CT-- >0) {
            String date = sc2.nextLine();
            String time = sc2.nextLine();
            String room = sc2.nextLine();
            caThiList.add(new CaThi(date, time, room));
        }
        int LT = Integer.parseInt(sc3.nextLine());
        List<LichThi> list = new ArrayList<>();
        while(LT-- >0) {
            List<String> tmp = new ArrayList<>();
            String[] str = sc3.nextLine().split(" ");
            String codeCaThi = str[0];
            String codeSubject = str[1];
            String group = str[2];
            int numofStu = Integer.parseInt(str[3]);
            for (CaThi c : caThiList) {
                for (Subject s : subjects) {
                    if(codeSubject.equals(s.getCode()) && codeCaThi.equals(c.getCode())){
                        list.add(new LichThi(s.getName(), group, numofStu, s, c));
                    }
                }
            }
        }
        Collections.sort(list, new Comparator<LichThi>() {
            @Override
            public int compare(LichThi o1, LichThi o2) {
                if(o1.getDate().equals(o2.getDate())){
                    return o1.getTime().compareTo(o2.getTime());
                } else {
                    return o1.getDate().compareTo(o2.getDate());
                }
            }
        });
        for (LichThi lt : list) {
            System.out.println(lt);
        }

    }

}
