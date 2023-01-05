import java.util.ArrayList;

//package OtherPractise.Tree;
//
//public class DepestLeaveSum {
//    public static void main(String[] args) {
//        Solution s = new Solution();
//        int[] root = {1,2,3,4,5,0,6,7,0,0,0,0,8};
//        TreeNode treeNode = new TreeNode(1);
//        treeNode.insert(treeNode,2);
//        treeNode.insert(treeNode,3);
//        treeNode.insert(treeNode,4);
//        treeNode.insert(treeNode,5);
//        treeNode.insert(treeNode,);
//
//        s.deepestLeavesSum(treeNode);
//
//    }
//}

//
// class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//
//    TreeNode() {
//    }
//
//    TreeNode(int val) {
//        this.val = val;
//    }
//
//    TreeNode(int val, TreeNode left, TreeNode right) {
//        this.val = val;
//        this.left = left;
//        this.right = right;
//    }
//
//    public void insert(TreeNode node, int val){
//        //for left
//        if(val < node.val){
//            if(node.left != null){
//                insert(node.left,val);
//            }else{
//                node.left = new TreeNode(val);
//            }
//        }
//        //for right
//        else if(val > node.val){
//            if(node.right != null){
//                insert(node.right,val);
//            }else{
//                node.right = new TreeNode(val);
//            }
//        }
//    }
//
//}
//
//class Solution {
//    public int deepestLeavesSum(TreeNode root) {
//
//    }
//}