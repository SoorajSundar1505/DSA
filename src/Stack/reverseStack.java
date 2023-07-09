package Stack;

import java.util.ArrayList;
import java.util.Stack;

public class reverseStack {
    private static Stack<Integer> stack;
    private static  ArrayList<Integer> list;

    public static void main(String[] args) {
        addStack();
        insertStackInArray();
        reverseElement();
    }

    public static void addStack(){
        stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
    }

    public static void insertStackInArray(){
        list = new ArrayList<>();
        for(int i:stack){
            list.add(i);
        }
    }

    public static void reverseElement(){
        for(int i:list){
            System.out.println(i);
        }
    }
}
