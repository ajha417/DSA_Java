package com.leetcode.prep.tree;

import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class ValidateBinarySearchTree {
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
        TreeNode right = new TreeNode(10);
        TreeNode left = new TreeNode(7);
        root.right = right;
        root.left = left;

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(6);

        root.right.left = new TreeNode(9);
        root.right.right = new TreeNode(11);

        boolean isValid = isValidBST(root);
        System.out.println(isValid);

    }

    private static boolean isValidBST(TreeNode root) {
        // the first way is that we can using iterative approach
        if (root == null) return true;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node.left != null) {
                if(node.left.val >= node.val) return false;
                queue.offer(node.left);
            }
            if (node.right != null) {
                if (node.right.val <= node.val) return false;
                queue.offer(node.right);
            }
        }
        return true;
    }
}