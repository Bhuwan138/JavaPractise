package OtherPractise.Recursion;

public class powerXN {
    public static void main(String[] args) {
        double x = 0.00001;
        int n = 2147483647;
        System.out.println(myPow(x,n));
    }

    static public double myPow(double x, int n) {
        //return Math.pow(x,n);
        return myPow1(x,n);

    }

    static public double myPow1(double x,long n){
        if(n == 0) return 1;
        if(n == 1) return x;
        if(n <0) return myPow1(1/x, -n);
        double result = myPow1(x*x,n/2);
        if(n%2 != 0) result *= x;
        return result;
    }
}
