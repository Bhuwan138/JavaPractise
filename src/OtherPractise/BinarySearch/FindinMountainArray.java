package OtherPractise.BinarySearch;

import java.util.Enumeration;

interface MountainArray{
    public int get(int index);
    public int length();
}
public class FindinMountainArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,3,1};
        int target = 3;
        MountainArray mountainArray = new MountainArray() {
            @Override
            public int get(int index) {
                return array[index];
            }
            @Override
            public int length() {
                return array.length;
            }
        };

        System.out.println(findInMountainArray(target,mountainArray));
    }

    public static int findInMountainArray(int target, MountainArray mountainArr) {
        int start = 0, end = mountainArr.length()-1;
        int n = mountainArr.length();
        int ans = -1;
        while (start<= end){
            int mid = start + (end-start)/2;
            int prev = (mid + n -1)%n;
            int next = (mid+1)%n;
            if(mountainArr.get(mid) > mountainArr.get(prev) && mountainArr.get(mid)> mountainArr.get(next)) end = mid;
            if(mountainArr.get(mid) == target) ans = mid;
            else if(mountainArr.get(mid) < target) start = mid;
            else end = mid-1;
        }
        return ans;
    }
}
