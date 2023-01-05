package OtherPractise;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimenational2dArray {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of salesman? ");
        int n = in.nextInt(),sn;
        int [][]arr = new int[n][];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the number of sales for " + (i+1) + " salesman ? ");
            sn = in.nextInt();
            arr[i] = new int[sn];
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Enter the amount of sales " +  (j+1) +  " for salesman " + (i+1) + " ? ");
                arr[i][j] = in.nextInt();
            }
        }

        for(int[] salesman : arr){
            System.out.println(Arrays.toString(salesman));
        }
    }
}
