package OtherPractise;

public class Leetcode_RichestCustomerWealth {
    public static void main (String[] args) {
        int [][] accounts = {{2,8,7},{7,1,3},{1,9,5}};
        int[] sum;
        int ans=0;
        for (int i = 0; i < accounts.length; i++) {
            sum = new int[accounts.length];
            for (int j = 0; j < accounts[i].length; j++) {
                sum[i] += accounts[i][j];
            }
            if(i < accounts.length)
                ans = max(ans,sum[i]);
        }
        System.out.println(ans);

    }
    static public int max(int a,int b) {
        return a > b ? a : b;
    }

}
