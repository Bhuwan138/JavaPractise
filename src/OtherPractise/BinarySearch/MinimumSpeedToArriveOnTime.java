package OtherPractise.BinarySearch;
/*
* https://leetcode.com/problems/minimum-speed-to-arrive-on-time/
* 1870. Minimum Speed to Arrive on Time
* */

import java.util.Arrays;

public class MinimumSpeedToArriveOnTime {
    public static void main(String[] args) {
        int[] dist = {1,1,100000};
        double hour =  2.1;
        System.out.println(minSpeedOnTime(dist,hour));
    }
    static public int minSpeedOnTime(int[] dist, double hour) {
        int low = 1, high = Arrays.stream(dist).max().getAsInt();
        int ans = -1;
        while (low <= high){
            int mid = low + (high-low)/2;
            if(maxSumAfterDividingByMid(dist,mid,hour)){
                ans = mid;
                high = mid-1;
            }else {
                low = mid+1;
            }
        }
        return ans;
    }

    private static boolean maxSumAfterDividingByMid(int[] dist, int divider, double hour) {
        int n=dist.length;
        double total=0;
        for(int i=0;i<n;i++){
            double timeTaken=0.0;
            if(i==n-1) timeTaken = (double)dist[i]/divider;
            else timeTaken = Math.ceil(Math.max((double)dist[i]/divider, 1.0));
            total += timeTaken;
        }
        return total<=hour;
    }
}
