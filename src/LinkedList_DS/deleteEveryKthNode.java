package LinkedList_DS;

public class deleteEveryKthNode {
    static LinkedList list = new LinkedList();
    public static void main(String[] args) {
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        list.deleteEveryKthNode(2);
        list.display();
    }

}
