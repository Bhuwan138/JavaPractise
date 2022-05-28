package OtherPractise.BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;

/*
* https://leetcode.com/problems/magnetic-force-between-two-balls/
* 1552. Magnetic Force Between Two Balls
* */
public class MagneticForceBetweenTeoBalls {
    public static void main(String[] args) {
        int[] position = {1,2,3,4,7};
        int m = 3;
        System.out.println(maxDistance(position,m));
    }

    static public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int length = position.length;
        int low = 1, high = position[length-1] - position[0];
        while (low<=high){
            int mid = low + (high - low)/2;
            if(possibleAns(position,mid,length,m)) low   = mid + 1;
            else  high = mid-1;
        }
        return high;
    }

    private static boolean possibleAns(int[] position, int distance, int length, int balls) {
        int start = 0, end = 0;
        balls--; // first ball is at first position
        while (end < length && balls >0){
            if(position[end] - position[start] >= distance){
                balls--;
                start = end;
            }
            end++;
        }
        return balls == 0;
    }
}
