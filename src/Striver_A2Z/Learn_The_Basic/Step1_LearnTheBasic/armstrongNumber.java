package Striver_A2Z.Learn_The_Basic.Step1_LearnTheBasic;

public class armstrongNumber {

    public static void main(String[] args) {
        int n = 153;
        System.out.println(armstrongNumber(n));
    }
    static String armstrongNumber(int n){
        int temp = n;
        int count = 0;
//        for counting
//        while (temp != 0){
//            temp /= 10;
//            count++;
//        }
//        shortcut for counting
        count = (int)Math.floor(Math.log10(n)+1);
        int sumOfNumber = 0;

        int firstValOfN = n;
        while (n!=0){
            int rem = n%10;
            sumOfNumber += Math.pow(rem,count);
            n /= 10;
        }
        if(sumOfNumber == firstValOfN) return "Yes";
        else return "No";
        // Time Complexity = O(N)
        // Scape Complexity = O(1)
    }
}
