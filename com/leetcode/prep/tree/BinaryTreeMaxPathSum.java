package com.leetcode.prep.tree;

public class BinaryTreeMaxPathSum {
    static class TreeNode {
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
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode right = new TreeNode(2);
        TreeNode left = new TreeNode(3);
        root.right = right;
        root.left = left;

        int val = maxPathSum(root);
        System.out.println("The max path sum is: " + val);
    }

    private static int maxPathSum(TreeNode root) {
        int[] maxValue = new int[1];
        maxValue[0] = Integer.MIN_VALUE;
        return findMax(root, maxValue);
    }

    private static int findMax(TreeNode root, int[] maxPathSum) {
        if(root == null) return 0;
        int left = Math.max(0, findMax(root.left, maxPathSum));
        int right = Math.max(0, findMax(root.right, maxPathSum));
        maxPathSum[0] = Math.max(maxPathSum[0], root.val + left + right);
        return Math.max(left, right) + root.val;
    }
}
