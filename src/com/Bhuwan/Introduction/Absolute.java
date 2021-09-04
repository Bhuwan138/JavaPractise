import java.util.Scanner;

class Absolute {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = in.nextInt();
        int result = (num > 0) ? num : -num;
        System.out.println(result);

    }
}