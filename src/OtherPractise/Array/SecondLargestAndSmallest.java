package OtherPractise.Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import static java.util.Collections.reverseOrder;

public class SecondLargestAndSmallest {
    public static void main(String[] args) {
        int[] arr = {45,78,12,89,56,74,41,10,85,20};
        //declaring variable for finding largest and second largest no
        int largest, secondLargest;
        secondLargest = largest = arr[0];

//        Arrays.sort(arr,Comparator.reverseOrder().compare(), );


        //here first assiging current largest value in secondLargest variable
        // then finding largest
        //it helps us to keep secondLargerst value in secondLargest variable
//        for (int j : arr) {
//            if (j > largest) {
//                secondLargest = largest; // assigning largest value in second largest
//                largest = j; // now finding largest
//            }
//        }
//        System.out.println("Second Largest Number is : " + secondLargest);

        //declaring variable for smallest and secondSmallest value
//        int smallest, secondSmallest;
//        secondSmallest = smallest = arr[0]; //assigning arr[0] value in smallest and secondSmallest variable
//        for (int j : arr) {
//            if (j < smallest) {
//                secondSmallest = smallest; //same as largest
//                smallest = j;
//            }
//        }
//        System.out.println("Second smallest number is : " + secondSmallest);
    }
}
