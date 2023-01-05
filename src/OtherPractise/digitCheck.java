package OtherPractise;

import java.util.Scanner;

public class digitCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,count = 0;
        System.out.println("Enter value : ");
        a = sc.nextInt();
        b = a;
        for (int i = 0; a >= 0; i++) {
            a/=10;
            count++;
        }

        if (count == 1)
            System.out.println("one digit");
        if (count == 2)
            System.out.println("Two digit");
        if(count == 3)
            System.out.println("three digit");
        if(count >= 4)
            System.out.println("multiple digit");
    }
}
