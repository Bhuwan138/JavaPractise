package OtherPractise.BinarySearch.Easy;
/*
* https://leetcode.com/problems/find-smallest-letter-greater-than-target/
* 744. Find Smallest Letter Greater Than Target
* */
public class FindSmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'j';
        System.out.println(nextGreatestLetter(letters,target));
    }

    static  public char nextGreatestLetter(char[] letters, char target) {
        int low = 0, high = letters.length-1;
        while(low <= high){
            int mid = (low + high)/2;

            if(low == high) return letters[high];
            if(target == letters[mid]) {
                if(mid>= high) return letters[mid];
                else return letters[mid+1];
            }
            else if(target > letters[mid]) low = mid+1;
            else high = mid;
        }
        return letters[high];
    }
}
