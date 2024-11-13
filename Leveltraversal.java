import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Leveltraversal {
    class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
            this.left = this.right = null;
        }
    }

    public Node BinaryTree(){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x == -1){
            return null;
        }

        Node temp = new Node(x);

        System.out.print("Enter the left child node of "+x+" :");
        temp.left = BinaryTree();
        System.out.print("Enter the right child node of "+x+" :");
        temp.right = BinaryTree();
        return temp;
    }

    public void levelOrderTraversal(Node root){


        if (root == null) {
            System.out.println("Tree is empty.");
            return;
        }

        Queue<Node> que = new LinkedList<>();
        que.add(root);



        while(!que.isEmpty()) {
            Node temp = que.poll();
            System.out.print(temp.val+" ");
            if (temp.left != null) {
                que.add(temp.left);
            }
            if (temp.right != null) {
                que.add(temp.right);
            }
        }
    }
    public static void main(String[] args) {

        Leveltraversal tree = new Leveltraversal();
        System.out.print("Enter the Root Node :");
        Node root = tree.BinaryTree();

        System.out.println();

        tree.levelOrderTraversal(root);

    }
}
