package com.leetcode.prep.tree;

public class KthSmallestElementInBST {
    private static int count = 0;
    private static int kthSmallest = 0;
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
        TreeNode root = new TreeNode(8);
        TreeNode right = new TreeNode(15);
        TreeNode left = new TreeNode(6);
        root.right = right;
        root.left = left;

        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(9);

        root.right.left = new TreeNode(9);
        root.right.right = new TreeNode(16);

        // this is the given BST, we need to find the kth smallest element in the subtree
        int k = 2;
        int kthSmallestElement = findKthSmallest(root, k);
        System.out.println("The kth smallest element is: " + kthSmallestElement);
    }

    private static int findKthSmallest(TreeNode root, int k) {
        // the first way is that we can traverse each element and put in the data structure
        // and then from there we will find the kth element
        traverseBST(root, k);
        return kthSmallest;
    }

    private static void traverseBST(TreeNode root, int k) {
        if(root == null) return;
        traverseBST(root.left, k);
        count++;
        if(count == k) {
            kthSmallest = root.val;
            return;
        }
        traverseBST(root.right, k);
    }
}
