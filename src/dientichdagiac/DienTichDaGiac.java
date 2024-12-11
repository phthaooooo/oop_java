package dientichdagiac;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Point {
    private int x, y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}
class Polygon{
    private static int n;
    private static Point[] p = new Point[n];
    public Polygon(Point[] p) {
        this.p = p;
    }

    public static String getArea(){

        int n = p.length;
        double area = 0;
        for (int i = 0; i < n; i++) {
            int j = (i + 1) % n;
            area += p[i].getX() * p[j].getY() - p[i].getY() * p[j].getX();

        }
        double res = Math.abs(area) / 2.0;
        String r1 = String.format("%.03f", res);

        return r1 ;
    }
}
public class DienTichDaGiac {
    public static void main(String[] args) throws FileNotFoundException  {
        Scanner in = new Scanner(new File("POLYGON.in"));
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            Point p[] = new Point[n];
            for(int i = 0; i < n; i++){
                p[i] = (new Point(in.nextInt(),in.nextInt()));
            }
            Polygon poly = new Polygon(p);
            System.out.println(poly.getArea());
        }
    }
}
