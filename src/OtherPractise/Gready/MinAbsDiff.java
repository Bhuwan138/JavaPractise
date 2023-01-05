package OtherPractise.Gready;

import java.util.Arrays;
import java.util.Scanner;

/*
    Min. Absolute Difference In Array
    Send Feedback
    Given an integer array A of size N, find and return the minimum absolute difference between any two elements in the array.
    We define the absolute difference between two elements ai, and aj (where i != j ) is |ai - aj|.
    Input format :
    Line 1 : Integer N, Array Size
    Line 2 : Array elements (separated by space)
    Output Format :
    Minimum difference
    Constraints :
    1 <= N <= 10^6
    Sample Input :
    5
    2 9 0 4 5
    Sample Input :
    1
*/
public class MinAbsDiff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int min = arr[0];
        Arrays.sort(arr);
        for (int i = 1; i < n; i++) {
            int currDiff = arr[i] - arr[i-1];
            if(currDiff < min)
                min = currDiff;
        }
        System.out.println(min);
    }
}
