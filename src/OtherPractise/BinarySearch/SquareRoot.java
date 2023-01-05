package OtherPractise.BinarySearch;

public class SquareRoot {
    public static void main(String[] args) {
        int x = 2147395599;
        System.out.println(mySqrt(x));
    }
    static public int mySqrt(int x) {
        long start = 0,end = x;

        if(x <2 )return x;
        while (start < end){
            long mid = start + (end-start)/2;
            if(mid*mid == x) {
                return (int)mid;
            }

            else if(mid*mid > x){
                end = mid;
            }else if(mid * mid < x){
                start = mid + 1;
            }


        }
        return (int)(start-1);
    }
}
