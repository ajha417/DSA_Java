import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class LevelNode{
    int data;
    LevelNode left,right;
    public LevelNode(int data){
        this.data = data;
    }
}
public class LevelOrderTraversal {
   static Scanner sc = null;
   static LevelNode createTree(){
       LevelNode root = null;
       int data = sc.nextInt();
       if(data==-1)
           return null;
       root = new LevelNode(data);

       System.out.println("Enter the left for "+data);
       root.left = createTree();

       System.out.println("Enter the right for "+data);
       root.right = createTree();

       return root;
   }
   static void printLevelOrder(LevelNode root){
       Queue<LevelNode> q = new LinkedList<>();
       q.add(root);

       while(!q.isEmpty()){
           LevelNode curr = q.poll();
           System.out.print(curr.data+" ->");
           if(curr.left!=null){
               q.add(curr.left);
           }
           if(curr.right!=null)
               q.add(curr.right);
       }
   }
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.println("Enter the root node ");
        LevelNode root = createTree();
        System.out.println();
        printLevelOrder(root);
    }
}
