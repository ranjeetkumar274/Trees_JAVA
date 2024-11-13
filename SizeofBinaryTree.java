import java.util.Scanner;

public class SizeofBinaryTree {
    class Node{
        int val;
        Node left;
        Node right;
        public Node(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }

    public Node BinaryTree(){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x == -1) return null;

        Node temp = new Node(x);
        //left side nodes
        System.out.print("Enter the left child node of " +x+" :");
        temp.left = BinaryTree();

        //right side node
        System.out.print("Enter the right child node of " +x+" :");
        temp.right = BinaryTree();

        return temp;
    }

    public static void main(String[] args) {

        SizeofBinaryTree tree = new SizeofBinaryTree();

        System.out.print("Enter the root node : ");
        Node root = tree.BinaryTree();
        tree.preordertraversal(root);
        System.out.println();
        int count = tree.getSize(root);
        System.out.println(count);

    }


    //this is for pre order traversal
    private void preordertraversal(Node root) {
        if(root == null) return;
        System.out.print(root.val+" ");
        preordertraversal(root.left);
        preordertraversal(root.right);
    }

    private int getSize(Node root){
        if(root == null){
            return 0;
        }
        return (1+getSize(root.left)+getSize(root.right));
    }

}

