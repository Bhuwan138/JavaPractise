package OtherPractise.Hashing;

import java.util.Arrays;
import java.util.HashMap;

public class Twosum {
    public static void main(String[] args) {
//        int[] arr = {2,7,11,15};
//        int target = 9;
//        Solutionss s = new Solutionss();
//        Arrays.toString(s.twosum(arr,target));
        String s = "Let's take LeetCode contest";
        Solutionss solution = new Solutionss();
        System.out.println(solution.reverseWords(s));
    }
}


class Solutionss{
    public int[] twosum(int[] nums, int target){
        return new int[]{1};
    }

        public String reverseWords(String s) {
            char[] ch = s.toCharArray();
            int last_index = -1;
            for(int i = 0; i <= s.length(); i++){
                if(i == s.length() || ch[i] == ' '){
                    int l = last_index + 1;
                    int r = i - 1;
                    while(l < r){
                        char temp = ch[l];
                        ch[l] = ch[r];
                        ch[r] = temp;
                        l++;
                        r--;
                    }
                    last_index = i;
                }
            }

            return new String(ch);

    }
}
