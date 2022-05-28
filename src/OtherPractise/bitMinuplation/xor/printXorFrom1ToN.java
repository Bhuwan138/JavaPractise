package OtherPractise.bitMinuplation.xor;

/*
    if(n % 4 == 0) print (n)
    if(n % 4 == 1) print (1)
    if(n % 4 == 2) print (n+1)
    if(n % 4 == 3) print (0)
    0001
    0010
    0011
    0100
    0101
    -----
    0001
 */
public class printXorFrom1ToN {
    public static void main(String[] args) {
        int n = 18;
        if(n % 4 == 0) System.out.println(n);
        else if(n %4 == 1) System.out.println(1);
        else if(n %4 == 2) System.out.println(n+1);
        else System.out.println(0);
    }
}
