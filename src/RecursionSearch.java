import java.util.ArrayList;

public class RecursionSearch {
    public static void main(String[] args) {
        int[] arr = {1};
        int target = 1;
        System.out.println(FindAllIndex(arr,target,0,new ArrayList<>()));
    }

    static ArrayList<Integer> FindAllIndex(int[] arr, int target, int index,ArrayList<Integer> list){
        if(index==arr.length){
            return list;
        }
        if(target==arr[index]){
            list.add(index);
        }
        return FindAllIndex(arr,target,index+1,list);
    }
}
