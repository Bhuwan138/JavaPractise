package OtherPractise.Gready;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class Man implements Comparator<Integer>{
    int roll;
    String name;

    public Man(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1-o2;
    }
}
public class NikunjAndDonuts {
    public static void main(String[] args) {
//        Integer[] nums = {1,3,2};
//        int n = 3;
//        Arrays.sort(nums,Collections.reverseOrder());
//        int ans = 0;
//        for (int i = 0; i < n; i++) {
//            ans += nums[i]*Math.pow(2,i);
//        }
//        System.out.println(ans);
        Man m = new Man(10,"Bhuwan");
        Man n = new Man(30,"Ram");
        Man o = new Man(20,"Shyam");

        System.out.println(m.name);


    }
}
