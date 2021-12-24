package OtherPractise;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_SpiralMatrix {
    public static void main (String[] args) {
        int[][] matrix ={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int top = 0;
        int buttom = matrix.length-1;
        int right=matrix[0].length-1;
        int left = 0;
        int direction = 0;
        List<Integer> list= new ArrayList<>();

        while(left<=right && top <=buttom){

            if(direction == 0){
                for (int i=left;i<=right;i++){
                    list.add(matrix[top][i]);
                }
                top++;
            }

            else if(direction == 1){
                for (int i=top;i<=buttom;i++){
                    list.add(matrix[i][right]);
                }
                right--;
            }

            else if(direction == 2){
                for (int i=right;i>=left;i--){
                    list.add(matrix[buttom][i]);
                }
                buttom--;
            }

            else if (direction == 3){
                for (int i=buttom;i>=top;i--){
                    list.add(matrix[i][left]);
                }
                left++;
            }

            direction = (direction + 1)%4;
        }
        System.out.println(list);
    }
}
