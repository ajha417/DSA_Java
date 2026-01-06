package com.leetcode;


import java.util.LinkedList;
import java.util.Queue;

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
}
public class MaxLevelSumBinaryTree {
    public static void main(String[] args) {
//        Given the root of a binary tree, the level of its root is 1, the level of its children is 2, and so on.
//
//        Return the smallest level x such that the sum of all the values of nodes at level x is maximal.
//
//
//
//        Example 1:
//
//
//        Input: root = [1,7,0,7,-8,null,null]
//        Output: 2
//        Explanation:
//        Level 1 sum = 1.
//        Level 2 sum = 7 + 0 = 7.
//        Level 3 sum = 7 + -8 = -1.
//        So we return the level with the maximum sum which is level 2.
//        Example 2:
//
//        Input: root = [989,null,10250,98693,-89388,null,null,null,-32127]
//        Output: 2

        TreeNode treeNode = new TreeNode(1,new TreeNode(7),new TreeNode(3));
        int level = maxLevelSum(treeNode);
        System.out.println("level: " + level);
    }

    public static int maxLevelSum(TreeNode root) {
        int maxSum = Integer.MIN_VALUE;
        int level = 0, ans = 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()) {
            level++;
            int currentSum = 0;
            for(int i = q.size(); i > 0; i--) {
                TreeNode node = q.poll();
                currentSum += node.val;

                if(node.left != null) {
                    q.offer(node.left);
                }
                if(node.right != null) {
                    q.offer(node.right);
                }
            }

            if(maxSum < currentSum) {
                maxSum = currentSum;
                ans = level;
            }
        }
        return ans;
    }
}
