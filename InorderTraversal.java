import java.util.Scanner;

class InNode{
    int data;
    InNode left,right;
    public InNode(int data){
        this.data = data;
    }
}
public class InorderTraversal {
  static   Scanner sc = null;
  static InNode createTree(){
      InNode root = null;
      int data = sc.nextInt();
      if(data==-1){
          return null;
      }
      root = new  InNode(data);
      System.out.println("Enter the left for "+data);
      root.left = createTree();

      System.out.println("Enter the right for "+data);
      root.right = createTree();

      return root;
  }
  static void inOrder(InNode root){
      if(root==null){
          return;
      }
      inOrder(root.left);
      System.out.print(" "+root.data);
      inOrder(root.right);
  }
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.println("Enter the root node");
        InNode root = createTree();
        System.out.println();
            inOrder(root);
    }
}
