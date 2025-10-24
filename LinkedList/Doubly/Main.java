package LinkedList.Doubly;

public class Main {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.inserFirst(3);
        list.inserFirst(2);
        list.inserFirst(8);
        list.inserFirst(17);
        list.insertLast(5);
        list.insert(2, 88);
        list.print();
        list.deleteFirst();
        list.deleteLast();
        System.out.println("----------");
        list.print();
    }
}
