package Trees.TreeAVL;

public class AVL {
    public class Node {
        private int val;
        private int height;        
        private Node left;
        private Node right;
        public Node(int val){
            this.val=val;
        }
        public int getVal(){
            return val;
        }
    }

    private Node root;

    public AVL() {
    }

    public int height(Node node){
        if(node==null) return-1;
        return node.height;
    }
    public boolean isEmpty(){
        return root==null;
    }

    public void insert(int val){
        root = insert(val, root);
    }

    private Node insert(int val, Node node){
        if(node==null){
            node = new Node(val);
            return node;
        }
        if(val<node.val){
            node.left = insert(val, node.left);
        }
        if(val>node.val){
            node.right = insert(val, node.right);
        }
        node.height = Math.max(height(node.left),height(node.right));
        return rotate(node);
    }

    private Node rotate(Node node){
        if(height(node.left)-height(node.right)>1){
            //left heavy
            if(height(node.left.left) - height(node.left.right)>0){
                //left-left case
                return rightRotate(node);
            }
            if(height(node.left.left) - height(node.left.right)<0){
                //left-right case
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }

        if(height(node.left)-height(node.right)<-1){
            //right heavy
            if(height(node.right.left) - height(node.right.right)<0){
                //right-right case
                return leftRotate(node);
            }
            if(height(node.right.left) - height(node.right.right)>0){
                //left-right case
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }
        return node;
    }

    public void populate(int[] nums){
        for(int i=0;i<nums.length;i++){
            this.insert(nums[i]);
        }
    }

    public void populateSorted(int[] nums){
        populateSorted(nums,0,nums.length);
    }

    private void populateSorted(int[] nums,int start ,int end){
        if(start>=end) return;

        int mid = (start+end)/2;
        insert(nums[mid]);
        populateSorted(nums, start,mid);
        populateSorted(nums, mid+1,end);
    }

    public boolean balanced(){
        return balanced(root);
    }
    private boolean balanced(Node node){
        if(node==null) return true;
        return Math.abs(height(node.left)-height(node.right)) <=1 && balanced(node.left) && balanced(node.right);
    }

    public void preOrder(){
        preOrder(root);
    }
    private void preOrder(Node node){
        if(node==null) return;
        System.out.print(node.val+" ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(){
        inOrder(root);
    }
    private void inOrder(Node node){
        if(node==null) return;
        inOrder(node.left);
        System.out.print(node.val+" ");
        inOrder(node.right);
    }
    public void postOrder(){
        postOrder(root);
    }
    private void postOrder(Node node){
        if(node==null) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.val+" ");
    }

    public void display(){
        display(this.root,"Root Node:");
    }

    private void display(Node node, String details){
        if (node==null) return;
        System.out.println(details+node.getVal());
        display(node.left, "Left child of "+node.val +": " );
        display(node.right, "Right child of "+node.val +": ");
    }

}
