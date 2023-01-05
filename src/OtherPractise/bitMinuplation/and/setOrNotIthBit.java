package OtherPractise.bitMinuplation.and;
/*
Check weather iTh bit is set or not

n = 1101   i=2   -> true
n= 1101    i=1   -> false

101 -> n
010 -> mask
000

for 10
10 -> 1010
i=3-> 0100 mask  = 4
ans-> 0000 -> false
 */
/*
simillar questions :
1. set the ith bit of a number -> for this create a mask and do OR gate in that
2. clear the ith bit of a number -> for this create a complement of mask and do and gate in that  (~mask & n) and mask = ~ (1<<i)
3. remove the last set bit ->  1101(1)0  = 110100 -> do (n& n-1)  like for 13 -> 1101 and n-1 => 1100 do and of both gives -> 1100
 */
public class setOrNotIthBit {
    public static void main(String[] args) {
        int n = 5;
        int i = 0;
        boolean set  = false;
        int mask = (1<<i);
        if((mask & n) != 0) set = true;
        else set = false;
        System.out.println(set);

    }
}
