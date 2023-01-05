package OtherPractise;

public class SuffleTheArray {

    public static void main(String[] args) {
        int []arr ={2,5,1,3,4,7};
        int n = 3;
        int pos = n;
        int j = 0;
        int []newArr = new int[2*n];
        for (int i=0;i<n;i++){
            newArr[j] = arr[i];
            newArr[j+1] = arr[pos++];
            j+=2;
        }
        //return newArr;





    }
}

