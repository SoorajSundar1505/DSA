public class LinkedList1 {
    private Node head;
    private Node tail;
    private int size = 1;

    public LinkedList1(){
        this.size=0;
    }
    private class Node {
        private int value;
        private Node next;


        public Node (int value){
            this.value=value;
        }

        public Node (int value, Node next){
            this.value=value;
            this.next = next;
        }
        }


    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size+=1;
    }

    public void Display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value+"->");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next=node;
        tail = node;
        size++;
    }

    public void insertLastNoTail(int val){
        Node node = new Node(val);
        if(head==null){
            head=new Node(node.value);
            return;
        }
        node.next=null;
        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;
            temp.next=node;
        }
        size++;

    }

    public void insertAtPos(int val, int index){
        if(index==0){
            insertFirst(val);
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




    public Node reverse(){
        Node curr = head;
        Node prev = null;
        Node fwd = null;
        while(curr!=null){
            fwd = curr.next;
            curr.next=prev;
            prev=curr;
            curr=fwd;

        }
        return prev;
    }
}
