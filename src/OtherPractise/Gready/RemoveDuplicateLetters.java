package OtherPractise.Gready;

import java.util.Iterator;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class RemoveDuplicateLetters {
    public static void main(String[] args) {
        int a = 43, b = 945;
        Solution sol = new Solution();
      //  System.out.println(sol.commonFactors(a,b));
    }
}
class Solution {
    public int maxSum(int[][] grid) {
        int maxVal = Integer.MIN_VALUE;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                int hr_sum = grid[i][j] + grid[i][j+1] + grid[i][j + 2] + grid[i+1][j+1] + grid[i+2][j] + grid[i+2][j+1] + grid[i+2][j+2];
                maxVal = Math.max(maxVal, hr_sum);
            }

        }
        return maxVal;
    }
}

//class Solution {
//    public int commonFactors(int a, int b) {
//        int count = 0;
//        int n = gcd(a,b);
//        for (int i = 1; i*i <= n; i++) {
//            if(n%i == 0){
//                if(n/i == i) count += 1;
//                else count += 2;
//            }
//        }
//
//        return count;
//    }
//
//    public int gcd(int a,int b){
//        if(b == 0) return a;
//        return gcd(b,a%b);
//    }
//}

//class Solution {
//    public int minimizeXor(int num1, int num2) {
//
//        int countbetsetinb = 0 ;
//
//        int B = num2;
//        while(B > 0)
//        {
//            countbetsetinb+=B%2;
//            B/=2;
//        }
//
//        int noofbitstosetinx = countbetsetinb;
//        int ans = 0;
//        for(int i=31;i>=0 && noofbitstosetinx != 0;i--)
//        {
//            int x = num1 & (1<<i);
//            if( x!= 0 )
//            {
//                ans|=(1<<i);
//                noofbitstosetinx--;
//            }
//
//        }
//
//        for(int i=0;i<=31 && noofbitstosetinx != 0;i++)
//        {
//            if((ans&(1<<i))==0)
//            {ans|=(1<<i);
//                noofbitstosetinx--;
//            }
//        }
//        return ans;
//    }
//}
//class Solution {
//    public String removeDuplicateLetters(String s) {
//        char[] ch = s.toCharArray();
//        Set<Character> set = new TreeSet<>();
//        for (Character c : ch){
//            set.add(c);
//        }
//        StringBuilder stringBuilder = new StringBuilder();
//        Iterator it = set.iterator();
//        while (it.hasNext()){
//            stringBuilder.append(it.next());
//        }
//        return stringBuilder.toString();
//    }
//}
