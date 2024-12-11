/*import java.util.Scanner;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point p) {
        return sqrt(pow(this.x - p.x, 2) + pow(this.y - p.y, 2));
    }
}

public class ChuViTamGiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();
            double x3 = sc.nextDouble();
            double y3 = sc.nextDouble();

            Point p1 = new Point(x1, y1);
            Point p2 = new Point(x2, y2);
            Point p3 = new Point(x3, y3);

            double a = p1.distance(p2);
            double b = p2.distance(p3);
            double c = p1.distance(p3);

            if (a + b > c && b + c > a && a + c > b) {
                System.out.printf("%.3f\n", a + b + c);
            } else {
                System.out.println("INVALID");
            }
        }
        sc.close();
    }
}*/