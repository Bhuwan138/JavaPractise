package OtherPractise;

import java.util.*;

public class kthsmallest {
    static void kthSmallestLargest(int arr[], int n, int k) {
        int largest,smallest;
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
        hashSet.add(arr[i]);
        }
        int []array = new int[hashSet.size()];
        Iterator<Integer> e = hashSet.iterator();
        int i=0;
        while ((e.hasNext())) {
            array[i] = e.next();
//            System.out.println(array[i] + " ");
            i++;
        }
        if(array.length < k-1)
        {
            System.out.println("-1 -1");
            return;
        }
        smallest = array[k-1];
        largest = array[array.length-k];

        System.out.print(largest + " "  + smallest);



    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            kthSmallestLargest(arr, n, k);
            t--;
        }
    }
}
