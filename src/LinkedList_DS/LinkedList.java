package LinkedList_DS;

public class LinkedList {
    static Node head;

    public void append(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void prepend(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAfter(Node prevNode, int data) {
        if (prevNode == null) {
            System.out.println("Previous node cannot be null.");
            return;
        }

        Node newNode = new Node(data);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

    public void delete(int data) {
        if (head == null) {
            return;
        }

        if (head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;
        Node prev = null;
        while (current != null && current.data != data) {
            prev = current;
            current = current.next;
        }

        if (current == null) {
            return;
        }

        prev.next = current.next;
    }




    public int findMiddleElement(){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow.data;
    }

    public Node deleteMiddle(){
//        Node start = new Node(0);
//        start.next=head;
//        Node slow = start;
//        Node fast = start;
//        while(fast.next!=null && fast.next.next!=null){
//            slow=slow.next;
//            fast=fast.next.next;
//
//        }
//        slow.next=slow.next.next;
//        return start.next;

        Node start=new Node(0);
        start.next=head;
        Node slow=start;
        Node fast=start;
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;

        }
        slow.next=slow.next.next;
        return start.next;
    }

    public void printElement(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public Node removeDupeElementInSorted(){
//        Node dummy = new Node(0);
//        dummy.next = head;
        Node dummy=head;
        while(dummy!=null && dummy.next!=null){
            if(dummy.data ==dummy.next.data){
                dummy.next=dummy.next.next;
            }else{
                dummy=dummy.next;
            }

        }
        return head;
    }

    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;
    }


    public void deleteEveryKthNode(int k){
        int c = 1;
        Node temp = head;
        Node prev = null;
        while(temp!=null){
            if(c%k==0){
                prev.next=temp.next;
            }else{
                prev=temp;
            }
            temp=temp.next;
            c++;
        }
    }
}
