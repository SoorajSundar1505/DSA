package LinkedList_DS;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import static LinkedList_DS.LinkedList.head;

public class checkIfLinkedListPalindrome {
    static List<Integer> arrayListRev = new ArrayList<>();
    static Stack<Integer> stack = new Stack<>();

    static LinkedList list = new LinkedList();

    public static void main(String[] args) {

        list.append(2);
        list.append(2);
        list.append(2);
//        list.append(4);
//        storeEleInArray();
//        System.out.println(arrayListRev);
//        storeEleInStack();

        System.out.println(verifyIsPalindrome());
    }

    public static List<Integer>  storeEleInArray(){
        Node temp = head;
        while(temp!=null){
            arrayListRev.add(temp.data);
            temp=temp.next;
        }
        return arrayListRev;
    }

    public static Stack<Integer> storeEleInStack(){
        Node temp = head;
        while(temp!=null){
            stack.push(temp.data);
            temp=temp.next;
        }
//        System.out.println("stack is "+stack);
        return stack;
    }

    public static boolean verifyIsPalindrome(){
        storeEleInStack();
        storeEleInArray();
        for(int i=0;i<arrayListRev.size();i++){
            if(arrayListRev.get(i)==stack.pop()) return true;
        }
        return false;
    }





}
