package OtherPractise.LeetCodeContest;

import java.lang.reflect.Array;
import java.util.*;

public class KthBeauty {
    public static void main(String[] args) {
        //int num = 240, k = 2;
//        int[] nums = {2,3,1,0};
        Solution solution = new Solution();
        String[] arr = {"z","z","z","gsw","wsg","gsw","krptu"};
//        System.out.println(solution.waysToSplitArray(nums));
        System.out.println(solution.removeAnagrams(arr));

        Set<Integer> set = new HashSet<>();
        int left = 1;
        int right = 100000000;
        for (int i = left; i <= right ; i++) {
            set.add(i);
        }
        System.out.println(set);


        //System.out.println(solution.divisorSubstrings(num,k));
        //solution.divisorSubstrings(num,k);
    }
}

class Solution {
    public  List<String> removeAnagrams(String[] words) {

        ArrayList<String> ans = new ArrayList<>();
        HashSet<String> found = new HashSet<> ();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            //word = sort(word);
            if (!found.contains(word)) {
                ans.add(words[i]);
                found.add(word);
            }
        }
        //Collections.sort(ans);
        return  ans;
    }
     String sort(String inputString)
    {

        char tempArray[] = inputString.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }

    public static String sortString(String inputString)
    {

        char tempArray[] = inputString.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }

    public static <T> Set<T> convertArrayToSet(T array[])
    {
        Set<T> set = new HashSet<>();
        for (T t : array) {
            set.add(t);
        }
        return set;
    }
}










//class Solution {
//    public int waysToSplitArray(int[] nums) {
//        long totalSum = 0;
//        for (int num : nums) {
//            totalSum += num;
//        }
//        long sumA = 0;
//        int count = 0;
//        for (int i = 0; i < nums.length - 1; i++) {
//            sumA += nums[i];
//            if (sumA >= (totalSum - sumA)) count++;
//        }
//        return count;
//    }
//}



/*
class Solution {
    public int divisorSubstrings(int num, int k) {
        String s = String.valueOf(num);
        int len = s.length();
        int count  = 0;



        for (int i = 0; i <= len - k; i++) {
            String subString = s.substring(i,i+k);
            int sub = Integer.parseInt(subString);


            if(sub == 0) continue;

            boolean check = isDivisable(num,sub);
            if(check){
                count++;
            }
        }


        return count;
    }

    public boolean isDivisable(int a, int b){
        if(a%b == 0) return true;
        return false;
    }
}


 */