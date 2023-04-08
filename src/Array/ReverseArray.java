package Array;

import java.util.ArrayList;
import java.util.List;

public class ReverseArray {
    public static void main(String[] args) {
        List<Integer> test = new ArrayList<>();
        test.add(1);
        test.add(2);
        test.add(3);
        int n = test.size();
        for(int i=n-1;i>=0;i--){
            test.add(test.get(i));
            test.remove(i);
        }
        System.out.println(test);
    }
}
