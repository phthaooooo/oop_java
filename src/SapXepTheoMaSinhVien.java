/*import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Student4 {

    private String id;
    private String name;
    private String className;
    private String email;

    public Student4(String id, String name, String className, String email) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + className + " " + email;
    }
}

public class SapXepTheoMaSinhVien {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Student> arrayList = new ArrayList<>();

        while (scanner.hasNext()) {
            arrayList.add(new Student4(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine()));
        }

        Collections.sort(arrayList, new Comparator<Student4>() {
            @Override
            public int compare(Student4 o1, Student4 o2) {
                return o1.getId().compareTo(o2.getId());
            }
        });

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}*/