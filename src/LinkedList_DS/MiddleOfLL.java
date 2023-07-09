package LinkedList_DS;

public class MiddleOfLL {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(2);
        list.append(2);
        list.append(3);
        list.append(4);

//        list.head=new Node(6);
//        list.head.next=new Node(61);
//        list.head.next.next=new Node(62);
//        list.head.next.next.next=new Node(66);

//        int res = list.findMiddleElement();

        list.display();
        list.reverse();
        list.display();

    }

}
