package OtherPractise.LeetCodeContest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CheckIfNumberHasEqualDigitCountAndDigitvalue {
    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
        String num = "1210";
        System.out.println(solution3.digitCount(num));
    }
}

class Solution3 {
    public boolean digitCount(String num) {
        int[] count = new int[10];

        for(char c: num.toCharArray()){
            count[c-'0']++;
        }

        for (int i = 0; i < num.length(); i++) {
            if(Character.getNumericValue(num.charAt(i)) != count[i])
                return false;
        }

        return true;
    }


}
