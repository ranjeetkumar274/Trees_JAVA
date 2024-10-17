import java.util.LinkedList;
import java.util.Queue;

public class Implementation {
    class Node {
        int val;
        Node left;
        Node right;

        public  Node(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }

    class BinaryTree {
        Node root;

        public BinaryTree() {
            this.root = null;
        }

        public void add(int val) {
            Node newNode = new Node(val);

            if (root == null) {
                root = newNode;
                return;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);

            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode.left == null) {
                    currNode.left = newNode;
                    break;
                } else {
                    q.add(currNode.left);
                }

                if (currNode.right == null) {
                    currNode.right = newNode;
                    break;
                } else {
                    q.add(currNode.right);
                }
            }
        }

        public void tarversal(){
            if(root == null){
                return;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);

            while(!q.isEmpty()){
                Node currNode = q.remove();
                System.out.print(currNode.val+" ");
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }
    }
    public static void main(String[] args){
        Implementation imple = new Implementation();
        BinaryTree bt = imple.new BinaryTree();
        bt.add(1);
        bt.add(2);
        bt.add(3);
        bt.add(4);
        bt.add(5);
        bt.add(6);
        bt.tarversal();
    }
}
