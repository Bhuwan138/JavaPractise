package OtherPractise.Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
* https://leetcode.com/problems/group-the-people-given-the-group-size-they-belong-to/
* 1282. Group the People Given the Group Size They Belong To
* */
public class GroupthePeopleGivenTheGrtoupSizeTheyBelongsTo_Medium {
    public static void main(String[] args) {
        int[] groupSizes = {3,3,3,3,3,1,3};
        System.out.println(groupThePeople(groupSizes));
    }
    static public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < groupSizes.length; i++) {
            if(map.containsKey(groupSizes[i])){
                List<Integer> list = map.get(groupSizes[i]);
                list.add(i);
                map.put(groupSizes[i], list);
            }else {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(groupSizes[i],list);
            }
        }
        for(int key : map.keySet()){
            List<Integer> x=map.get(key);
            for(int i=0;i<x.size();i=i+key){
                List<Integer> p=new ArrayList<>();
                for(int j=i;j<i+key;j++){
                    p.add(x.get(j));
                }
                result.add(p);
            }
        }

        return result;
    }
}
