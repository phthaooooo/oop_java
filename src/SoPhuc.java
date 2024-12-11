import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ComPlexNumber {
    private int a, b;
    public ComPlexNumber(){

    }
    public ComPlexNumber(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public String CD_cal(ComPlexNumber o){
        int thuc = this.a + o.getA();
        int ao = this.b + o.getB();

        int thuc1 = this.a * thuc - this.b * ao;
        int ao1 = this.a * ao + this.b * thuc;

        int thuc2 = thuc * thuc - ao * ao;
        int ao2 = thuc * ao + ao * thuc;
        String s1 = thuc1 + (ao1 >= 0 ? " + " : " - ") + Math.abs(ao1) + "i";
        String s2 = thuc2 + (ao2 >= 0 ? " + " : " - ") + Math.abs(ao2) + "i";
        return s1 + ", " + s2;
    }

}
public class SoPhuc {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            String line = sc.nextLine();
            String[] lines = line.split(" ");
            int[] a = new int[4];
            for ( int i = 0; i < 4; i++){
                a[i] = Integer.parseInt(lines[i]);
            }
            List<ComPlexNumber> list = new ArrayList<>(2);
            ComPlexNumber s = new ComPlexNumber(a[0], a[1]);
            ComPlexNumber s0 = new ComPlexNumber(a[2], a[3]);
            System.out.println(s.CD_cal(s0));
        }
    }
}
