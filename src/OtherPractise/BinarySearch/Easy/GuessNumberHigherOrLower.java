package OtherPractise.BinarySearch.Easy;

public class GuessNumberHigherOrLower {
    public static void main(String[] args) {
        int n= 2126753390;
        System.out.println(guessNumber(n));
    }
    static public int guessNumber(int n) {
        int low = 1;
        int high = n;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(guess(mid) == 0)
                return mid;
            else if(guess(mid) <= -1)
                high = mid-1;
            else
                low = mid+ 1;
        }
        return 0;
    }

    private static int guess(int num) {
        int picked = 1702766719;
        if(num == picked) return 0;
        else if(num > picked) return -1;
        else return 1;
    }
}
