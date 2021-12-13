package com.Programs.Count;

public class UseArraySearch {
    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        System.out.println("Enter the number of array : ");
        int n = in.nextInt();
        int []arr = new int[n];
        System.out.println("Enter the elements : ");
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("Enter what do you want to search in array : ");
        int x = in.nextInt();

        ArraySearch s = new ArraySearch();
        int []rec = s.search(arr,x);
        for (int r : rec )  {
            System.out.println("Location " + r);
        }

    }

}
