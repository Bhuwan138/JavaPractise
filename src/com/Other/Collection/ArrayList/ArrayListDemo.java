package com.Other.Collection.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        num.add(25); //Index : 0
        num.add(45); //Index : 1
        num.add(956);
        num.add(63);

        Iterator<Integer> it =  num.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }


//        for(int nums: num) {
//            System.out.println(nums);
//        }

    }
}
