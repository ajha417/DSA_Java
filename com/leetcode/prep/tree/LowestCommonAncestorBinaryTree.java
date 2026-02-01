package com.leetcode.prep.tree;

public class LowestCommonAncestorBinaryTree {
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

        TreeNode result = findLowestCommonAncestor(root, root.left, root.right);
    }

    private static TreeNode findLowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // give node p and q, we need to find the lowest common ancestor of both nodes
        // the first approach is that we can do dfs to find p and add all the nodes that comes in its path using list
        // also, add all the nodes that comes in between the path during finding q
        // from both list we find the last common node, which denotes that it is the lowest common ancestor of p & q


        // but this will have extra space complexity i.e. using lists

        if(root == null || root == p || root == q) return root;
        TreeNode left = findLowestCommonAncestor(root.left, p, q);
        TreeNode right = findLowestCommonAncestor(root.right, p, q);
        if(left == null) return right;
        if(right == null) return left;
        return root;
    }
}
