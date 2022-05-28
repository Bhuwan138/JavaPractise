package OtherPractise.Tree;

import java.util.ArrayList;
import java.util.Iterator;

/*
* https://leetcode.com/problems/convert-bst-to-greater-tree/
* 538. Convert BST to Greater Tree
* */
public class ConvertBSTToGreaterTree {
    public static void main(String[] args) {
        class TreeNode {
            int val;
            TreeNode left;
            TreeNode right;
            TreeNode() {}
            TreeNode(int val) { this.val = val; }
            TreeNode(int val, TreeNode left, TreeNode right) {
                this.val = val;
                this.left = left;
                this.right = right;
            }



            public TreeNode insert(Integer[] arr,TreeNode root, int i){
                if (i< arr.length){
                    int val = arr[i]!= null ? arr[i]:-1;
                    root = new TreeNode(val);
                    root.left = insert(arr,root.left,2*i+1);
                    root.right = insert(arr,root.right,2*i + 2);

                }
                    return root;
            }
        }

        class Solution {
            public TreeNode convertBST(TreeNode root) {
                if( root == null) return root;
                iconvertBST(root,0);
                return root;
            }

            public int iconvertBST(TreeNode root, int tempRootValue){

                //if(root == null) return 0;

                //go to the deepest right node and add its value
                if(root.right != null) root.val += iconvertBST(root.right,tempRootValue);
                else root.val += tempRootValue;

                //checking for left value
                if(root.left != null) return iconvertBST(root.left,root.val);

                return root.val;
            }
        }

        Solution s = new Solution();
        TreeNode root = new TreeNode();
        Integer[] arr = {4,1,6,0,2,5,7,null,null,null,3,null,null,null,8};
        root.insert(arr,root,0);
        System.out.println(s.convertBST(root).toString());

    }
}
