package Trees;

import java.util.Scanner;

public class BinaryTree {
    Node root;
    public BinaryTree() {

    }

    class Node {
        int val;
        Node left;
        Node right;
        public Node(int val) {
            this.val = val;
        }
    }

    // insert elements
    public void populate(Scanner sc){
        System.out.println("Enter the root: ");
        int val=sc.nextInt();
        root = new Node(val);
        populate(sc, root);
    }
    private void populate(Scanner sc , Node node){
        System.out.println("Do you want to enter at the left of "+ node.val);
        boolean left = sc.nextBoolean();
        if (left) {
            System.out.println("Enter the value to insert at left of: " + node.val);
            int val = sc.nextInt();
            node.left=new Node(val);
            populate(sc, node.left);
        }

        System.out.println("Do you want to enter at the right of "+ node.val);
        boolean right = sc.nextBoolean();
        if (right) {
            System.out.println("Enter the value to insert at right of: " + node.val);
            int val = sc.nextInt();
            node.right=new Node(val);
            populate(sc, node.right);
        }
    }

    //display
    public void display(){
        display(root, "");
    }
    public void display(Node node, String indent){
        if(node==null) return;
        System.out.println(indent + node.val);
        display(node.left,indent + "\t");
        display(node.right,indent + "\t");
    }

    public void prettyDisplay(){
        prettyDisplay(root, 0);
    }

    public void prettyDisplay(Node node, int level){
        if(node==null) return;
        prettyDisplay(node.right, level+1);
        if(level!=0){
            for(int i=0;i<level-1;i++){
                System.out.print("|\t\t");
            }
            System.out.println("|------->" + node.val);
        }else{
            System.out.println(node.val);
        }
        prettyDisplay(node.left,level+1);
    }


    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        Scanner sc = new Scanner(System.in);
        bt.populate(sc);
        // bt.display();
        // System.out.println("------------");
        bt.prettyDisplay();
    }
}
