package Striver_A2Z.Learn_The_Basic.Step1_LearnTheBasic;

public class checkPrime {
    public static void main(String[] args) {
        int n = 6;
        boolean ans = isPrime(n);
        if(ans == true && n>1)
            System.out.println("Prime Number");
        else
            System.out.println("Non Prime Number");
    }

    private static boolean isPrime(int n) {
        for (int i = 2; i < Math.sqrt(n) ; i++) {
            if(n%i == 0) {
                return false;
            }
        }
        return true;

//        Time Complexity = O (Sqrt(n))
//    Space Complexity = O(1)
    }
}
