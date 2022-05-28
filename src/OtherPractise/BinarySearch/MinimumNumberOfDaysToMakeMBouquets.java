package OtherPractise.BinarySearch;

import java.util.Arrays;

/*
* https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/
* 1482. Minimum Number of Days to Make m Bouquets
* */
public class MinimumNumberOfDaysToMakeMBouquets {
    public static void main(String[] args) {
        int[] bloomDay = {7,7,7,7,12,7,7};  //{1,10,3,10,2}; //{1,10,3,10,2};
        //int m = 3, k = 1;
        //int m = 3, k = 2;
        int m = 2, k = 3;
        System.out.println(minDays(bloomDay,m,k));
    }

    static public int minDays(int[] bloomDay, int m, int k) {
        int minDays = Arrays.stream(bloomDay).min().getAsInt();
        int maxDays = Arrays.stream(bloomDay).max().getAsInt();
        int result = -1;
        while (minDays <= maxDays){
            int mid = minDays + (maxDays - minDays)/2;
            if(flowerCollectedInBloomDays(bloomDay,mid,m,k)){
                result = mid;
                maxDays = mid - 1;
            }else {
                minDays = mid +1;
            }
        }
        return result;
    }

    private static boolean flowerCollectedInBloomDays(int[] bloomDay, int mid, int bouquets, int flowers) {
        int collectedFlower = 0;
        int totalBouquets = 0;
        for(int colDays : bloomDay ){
            if(colDays <= mid){
                collectedFlower++;
            }else collectedFlower = 0;

            if(flowers == collectedFlower){
                collectedFlower = 0;
                totalBouquets++;
            }
        }

        return totalBouquets >= bouquets;
    }
}
