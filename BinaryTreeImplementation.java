import java.util.Scanner;

public class BinaryTreeImplementation {
    static Scanner sc = null;
    public static void main(String[] args) {
        sc= new Scanner(System.in);
        createTree();
    }
    static BNode createTree(){
        BNode root = null;
        System.out.println("Enter the data:");
        int data = sc.nextInt();
        if(data==-1){
            return null;
        }
        root = new BNode(data);
        System.out.println("Enter the left for "+data);
        root.left = createTree();

        System.out.println("Enter the right for "+data);
        root.right = createTree();
        return root;
    }

}
class BNode{
    int data;
    BNode left,right;
    public BNode(int data){
        this.data = data;
    }
}