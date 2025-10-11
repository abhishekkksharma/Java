package LinkedList;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        //insert
        list.inserFirst(3);
        list.inserFirst(2);
        list.inserFirst(8);
        list.inserFirst(17);
        list.insertLast(20);
        list.insert(100, 3);
        list.insert(13, 1);
        list.printList();
        //delete
        System.out.println("This element is deleted from first: "+list.deleteFirst());
        System.out.println("This element is deleted from end: "+list.deleteLast());
        System.out.println("Deleted with index: "+list.delete(3));
        list.printList();
        System.out.println("Size: "+list.size);
    }
}
