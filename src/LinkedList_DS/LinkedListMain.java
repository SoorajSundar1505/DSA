package LinkedList_DS;

public class LinkedListMain extends LinkedList {
    public static void main(String[] args) {
        LinkedList ls = new LinkedList();
        ls.insertFirst(4);
        ls.insertFirst(5);
        ls.insertFirst(7);
        ls.insertFirst(9);
        ls.Display();
        ls.insertAtPos(6,2);
//        ls.insertLastNoTail(7);
        ls.Display();
        System.out.println("After Reverse");
        ls.reverse();
        ls.Display();

    }
}
