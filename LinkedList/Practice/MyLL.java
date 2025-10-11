package LinkedList.Practice;

class Node {
    int value;
    Node next;
    public Node(int value) {
        this.value = value;
    }
    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }   
}

public class MyLL {
    Node head;
    Node tail;

    int size;

    public MyLL() {
        size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head=node;

        if(tail == null){
            tail=head;
        }
        size++;
    }

    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next=node;
        tail=node;
    }

    public void inset(int val, int index){
        if(index<0 || index>size){
            System.out.printf("Index %d is out of bound!\n",index);
            return;
        }
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next = node;
        size++;
    }

    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public static void main(String[] args) {
        MyLL list = new MyLL();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertLast(100);
        list.inset(4, 1);
        list.print();
        System.out.println(list.size);
    }
    
}

