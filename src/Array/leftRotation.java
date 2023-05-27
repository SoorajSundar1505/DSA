package Array;

import java.util.ArrayList;
import java.util.List;

public class leftRotation {

    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        int d = 4;

        int n = arr.size();
        System.out.println(n);
            for(int i=0;i<d;i++) {
                arr.add(n, arr.get(0));
                arr.remove(0);
            }
        System.out.println(arr);
    }
}
