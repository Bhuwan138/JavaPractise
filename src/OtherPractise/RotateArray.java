package OtherPractise;

import java.util.Scanner;

public class RotateArray {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr=new int[n],brr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int x = in.nextInt();

        for (int i = 0; i < arr.length; i++) {
            brr[i] = arr[(i+x)%n];
            System.out.print(brr[i] + " ");
        }
    }

}
