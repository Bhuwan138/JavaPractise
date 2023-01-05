package Bhuwan;
import java.util.Scanner;
public class UseCircle {
    public static void main(String[] args) {
        Circle c = new Circle();
        Scanner in = new Scanner(System.in);
        int radius = in.nextInt();
        c.calculateArea(radius);
        c.calculateCircumference(radius);
    }
}
