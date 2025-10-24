package LinkedList.Single;

public class LL {
    Node head;
    Node tail;
    
    int size;

    public LL() {
        this.size = 0;
    }

    // inserting element at the starting
    public void inserFirst(int value){
        Node node = new Node(value);
        node.next=head;
        head = node;

        if(tail==null){
            tail=head;
        }
        size+=1;
    }

    // inserting element at the end of list
    public void insertLast(int val){
        if(tail==null){
            inserFirst(val);
            return;
        } 
        Node node = new Node(val);
        tail.next = node;
        tail=node;
        size++;
    }

    // insert at index
    public void insert(int val, int index){
        if(index<0 || index>size){
            System.out.printf("Index %d out of bound\n",index);
            return;
        }
        if(index==0){
            inserFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next=node;
        size++;
    }

    // insert at index using recursion
    public void insertRec(int val, int index){
        head = insertRec(val, index, head);
    }
    private Node insertRec(int val, int index, Node node){
        if(index==0){
            Node temp = new Node(val,node);
            size++;
            return temp;
        }
        node.next = insertRec(val, index-1,node.next);
        return node;
    }
    //delete first Node (head)
    public int deleteFirst(){
        int val = head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;//value that is deleted (not neccesary to return)
    }

    //delete Last Node(tail)
    public int deleteLast(){
        if(size<=1){
            head=null;
        }
        Node secondLast = getNode(size-2);
        int val = tail.value;
        tail=secondLast;
        tail.next=null;
        size--;
        return val;
    }

    //delete with index
    public int delete(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index==size){
            return deleteLast();
        }
        Node prev = getNode(index-1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        size--;
        // prev.next=null; // not needed because now no pointer is pointing to it;
        return val;
    }

    //get Node
    public Node getNode(int index){
        Node node = head;
        for(int i=0;i<index;i++){
            node = node.next;
        }
        return node;
    }
    //merge two sorted lists leetcode: 21
    public static LL merge(LL first, LL second){
        Node f = first.head;
        Node s = second.head;
        LL ans = new LL();
        while(f!=null && s!=null){
            if(f.value<=s.value){
                ans.insertLast(f.value);
                f=f.next;
            }
            else{
                ans.insertLast(s.value);
                s=s.next;
            }
        }
        while (f!=null) {
            ans.insertLast(f.value);
            f=f.next;
        }
        while (s!=null) {
            ans.insertLast(s.value);
            s=s.next;
        }
        return ans;
    }

    //find node
    public Node find(int value){
        Node node = head;   
        while(node!=null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    //Printing the list
    public void printList() {
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void printReverse(Node head) {
    if (head == null) return;
    printReverse(head.next);
    System.out.print(head.value + " -> ");
    }

    //Node class 
    private class Node{
        private int value;
        private Node next;
        public Node(int value) {
            this.value = value;
        }
        public Node(int value, Node next) {
        this.value = value;
        this.next = next;
        }
    }
}
