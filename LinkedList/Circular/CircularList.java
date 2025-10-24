package LinkedList.Circular;

public class CircularList {
    Node head;
    Node tail;
    public CircularList() {
        this.head = null;
        this.tail = null;
    }
    public void insert(int val){
        Node node = new Node(val);
        if(head==null){
            head=node;
            tail=node;
            return;
        }
        tail.next=node;
        node.next=head;
        tail=node;
    }
    public void delete(int val){
        Node node = head;
        if(node == null){
            return;
        }
        if(node.val==val){
            head = head.next;
            tail.next=head;
            return;
        }
        do {
            Node n = node.next;
            if(n.val==val){
                node.next=n.next;
                break;
            }
            node=node.next;
        } while (node!=head);

    }
    public void display(){
        Node temp = head;
        if(head!=null){
            do {
                System.out.print(temp.val+" -> ");
                temp=temp.next;
            } while (temp!=head);
        }
        System.out.println("HEAD");
    }
    private class Node{
        int val;
        Node next;
        public Node(int val) {
            this.val = val;
        }
                
    }
    public static void main(String[] args) {
        CircularList list = new CircularList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.delete(4);
        list.display();
    }
}
