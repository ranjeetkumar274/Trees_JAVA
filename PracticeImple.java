import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node{
    int val;
    Node left;
    Node right;

    public Node(int val){
        this.val = val;
        this.left = this.right = null;
    }
}
class BinaryTree{
    public Node BinaryTree(){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x == -1) return null;

        Node temp = new Node(x);
        System.out.print("Enter the left Node of " + x +" : ");
        temp.left = BinaryTree();
        System.out.print("Enter the right Node of " + x +" : ");
        temp.right = BinaryTree();

        return temp;
    }

    public void preOrder(Node root){
        if(root == null) return;
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);

    }
}

public class PracticeImple {
    public static void main(String[] args){
        System.out.print("Enter your root here : ");
        BinaryTree bt = new BinaryTree();
        Node root = bt.BinaryTree();
        bt.preOrder(root);
    }
}
