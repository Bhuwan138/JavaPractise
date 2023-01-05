package OtherPractise.LeetCodeContest;

import java.util.Arrays;

public class PathInMatrixWhichSumIsL {
    public static void main(String[] args) {
//        int[] pref = {13};
//        System.out.println(Arrays.toString(findArray(pref)));
        int n = 10;
//        int[][] logs = {{0,3},{2,5},{0,9},{1,15}};
        int[][] logs = {{0,10},{1,20}};
        System.out.println( hardestWorker(n,logs) );
    }

    static public int hardestWorker(int n, int[][] logs) {
        int temp = 0, ans = 0, prev = 0;
        for (int i = 0; i < logs.length; i++) {
            if(i>0) prev = logs[i-1][1];
            else prev = 0;
            if( (logs[i][1] - prev) > temp) {
                ans = logs[i][0];
                temp = logs[i][1] - prev;
            }
            else if((logs[i][1]-prev) == temp)
                ans = Math.min(ans,logs[i][0]);
        }
        return ans;
    }
    static public int[] findArray(int[] pref) {
        int[] result = new int[pref.length];
        result[0] = pref[0];
        for (int i = 1; i < pref.length; i++) {
            result[i] ^= pref[i] ^ pref[i-1];
        }
        return result;
    }

//    static public int numberOfPaths(int[][] grid, int k) {
//
//    }
}




