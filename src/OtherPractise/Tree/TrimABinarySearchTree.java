package OtherPractise.Tree;
/*
* https://leetcode.com/problems/trim-a-binary-search-tree/
* 669. Trim a Binary Search Tree
* */

import javax.swing.*;

public class TrimABinarySearchTree {
        TreeNode root;
    public static void main(String[] args) {
        TrimABinarySearchTree trimABinarySearchTree = new TrimABinarySearchTree();
        int[] arr = {1,0,2};
        int left = 1,right = 2;
        trimABinarySearchTree.root = trimABinarySearchTree.insertLevelOrder(arr,trimABinarySearchTree.root,0);

        System.out.println();
        System.out.println(trimBST(trimABinarySearchTree.root,left,right));
    }

    static  public TreeNode trimBST(TreeNode root, int low, int high) {
        if(root == null) return null;

        if(root.val < low ) return trimBST(root.right,low,high);
        if(root.val > high) return trimBST(root.left,low,high);

        root.left = trimBST(root.left,low,high);
        root.right = trimBST(root.right,low,high);
        return root;
    }
    static public class TreeNode {
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


    }
    public TreeNode insertLevelOrder(int[] arr, TreeNode root,
                                     int i)
    {
        // Base case for recursion
        if (i < arr.length) {
            TreeNode temp = new TreeNode(arr[i]);
            root = temp;

            // insert left child
            root.left = insertLevelOrder(arr, root.left,
                    2 * i + 1);

            // insert right child
            root.right = insertLevelOrder(arr, root.right,
                    2 * i + 2);
        }
        return root;
    }
    public void inOrder(TreeNode root)
    {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.val + " ");
            inOrder(root.right);
        }

    }


}
