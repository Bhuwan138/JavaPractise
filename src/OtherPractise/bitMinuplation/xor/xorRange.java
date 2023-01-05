package OtherPractise.bitMinuplation.xor;
/*

    0011
    0100
    0101
    0110
    ----
    0100 -> 4
 */
public class xorRange {
    public static void main(String[] args) {
        int l = 3,r = 6;
        int ans = range(r) ^ range(l-1);
        System.out.println(ans);

    }
    public static int range(int n){
        if(n % 4 == 0) return n;
        else if(n %4 == 1) return 1;
        else if(n %4 == 2) return (n+1);
        else return 0;
    }
}
