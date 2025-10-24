package LinkedList.Single;

public class Main {
    public static void main(String[] args) {
        // LL list = new LL();
        // //insert
        // list.inserFirst(3);
        // list.inserFirst(2);
        // list.inserFirst(8);
        // list.inserFirst(17);
        // list.insertLast(20);
        // list.insert(100, 3);
        // list.insert(13, 1);
        // list.printList();
        // //delete
        // System.out.println("This element is deleted from first: "+list.deleteFirst());
        // System.out.println("This element is deleted from end: "+list.deleteLast());
        // System.out.println("Deleted with index: "+list.delete(3));
        // list.printList();
        // list.printReverse(list.head);
        // System.out.println("Size: "+list.size);
        // list.insertRec(999, 3);
        // list.printList();

        LL first = new LL();
        first.insertLast(1);
        first.insertLast(3);
        first.insertLast(5);

        LL second = new LL();
        second.insertLast(1);
        second.insertLast(2);
        second.insertLast(9);
        second.insertLast(14);
        
        LL ans = LL.merge(first, second);
        ans.printList();
    }
}
