package Striver_A2Z.Learn_The_Basic.Step1_LearnTheBasic;

public class GCD {
    public static void main(String[] args) {
        int num1 = 8, num2 = 12;
//        System.out.println(gcd(num1,num2));
        System.out.println(euclidean_gcd(num1,num2));
    }

    
    private static int euclidean_gcd(int a, int b) {
        if(b == 0) return a;
        return euclidean_gcd(b,a%b);

        // Time Complexity = O(log-thita min(a,b)), where thita = 1.61
        // Space Complexity = O(1)
    }

    private static int gcd(int num1, int num2) {
        int min = Math.min(num1, num2);
        int hcf = 1;
        for (int i = 2; i <= min; i++) {
            if(num1 % i == 0 && num2 % i == 0) hcf = i;
        }
        return hcf;
        // Time Complexity = O(n)
        // Space Complexity = O(1)
    }
}
