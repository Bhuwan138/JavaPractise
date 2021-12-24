package OtherPractise;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfInfiniteArray {
    public static void main (String[] args) {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int []arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int x = in.nextInt();
        for (int i = 0; i < n; i++) {
            if (x == arr[i]) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);

    }
}
