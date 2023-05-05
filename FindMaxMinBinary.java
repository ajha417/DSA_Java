import java.util.Scanner;
class MaxMinNode{
    int data;
    MaxMinNode left,right;
    public MaxMinNode(int data){
        this.data = data;
    }
}
public class FindMaxMinBinary {
    static Scanner sc = null;
    static MaxMinNode createNode(){
        MaxMinNode root = null;
        int data = sc.nextInt();
        if(data==-1){
            return null;
        }
        root = new MaxMinNode(data);
        System.out.println("Enter the left for "+data);
        root.left = createNode();
        System.out.println("Enter the right for "+data);
        root.right = createNode();
        return root;
    }
    static int findMax(MaxMinNode root){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        return Math.max(root.data,Math.max(findMax(root.left),findMax(root.right)));
    }
    static int findMin(MaxMinNode root){
        if(root == null)
            return Integer.MAX_VALUE;
        return Math.min(root.data,Math.min(findMin(root.left),findMin(root.right)));
    }
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.println("Enter the root");
            MaxMinNode result = createNode();
        System.out.println("The maximum value is "+findMax(result));
    }
}
