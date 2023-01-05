package OtherPractise.BinarySearch;

public class ReachANumber {
    public static void main(String[] args) {
        int target = 8;
        System.out.println(reachNumber(target));
    }

    static public int reachNumber(int target) {
        int sum=0, steps = 0;
        target = Math.abs(target);

        while (sum <target){
            steps++;
            sum+= steps;
        }

        while ((sum-target)%2 == 1){
            sum+=steps;
            steps++;
        }

        return steps-1;
    }
}
