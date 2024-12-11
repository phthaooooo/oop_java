import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*class Student {
    String code, name, phone;
    int order;

    public Student(String code, String name, String phone, int order){
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
    @Override
    public String toString(){

        return code + " " + name + " " + phone;
    }
}

public class QuanLyBaiTapNhom1 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        String[] a = sc.nextLine().split(" ");
        int t = Integer.parseInt(a[0]);
        int g = Integer.parseInt(a[1]);
        ArrayList<Student> s = new ArrayList<>(t);
        for (int i = 0; i < t; i++) {
            String code = sc.nextLine();
            String name = sc.nextLine();
            String phone = sc.nextLine();
            int order = Integer.parseInt(sc.nextLine());
            Student k = new Student(code, name, phone, order);
            s.add(k);
        }

        String[] mission = new String[g];
        for (int i = 0; i < g; i++) {
            mission[i] = sc.nextLine();
        }
        int q = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < q; i++) {
            int qnums = Integer.parseInt(sc.nextLine());
            System.out.println("DANH SACH NHOM " + qnums + ":" );
            for(Student stu : s){
                if(qnums == stu.getOrder()){
                    System.out.println(stu);
                }
            }
            System.out.println("Bai tap dang ky: " + mission[qnums - 1]);
        }


    }
}*/
