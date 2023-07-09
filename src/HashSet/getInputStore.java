package HashSet;

import java.util.*;

public class getInputStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length");
        int n = sc.nextInt();
        Set<Integer> set = new HashSet<>();
        Scanner nums = new Scanner(System.in);
        for(int i=0;i<n;i++){
            int num = nums.nextInt();
            set.add(num);
        }
        double ans = 0;
        int ansInt = 0;
        System.out.println(set);
        List<Integer> list = new ArrayList<>(set);
        int start = 0,end=list.size(),mid=start+(end-start)/2;
        if(list.size()%2!=0){
            ansInt = list.get(mid);
        }else{
            System.out.println(list.get(mid));
            System.out.println(list.get(mid-1));
            ans = list.get(mid)+list.get(mid-1);
            ans=ans/2;
        }
    System.out.println(ans);
    }

    public static List<Integer> getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length");
        int n = sc.nextInt();
        Set<Integer> set = new HashSet<>();
        Scanner nums = new Scanner(System.in);
        for(int i=0;i<n;i++){
            int num = nums.nextInt();
            set.add(num);
        }
        List<Integer> list = new ArrayList<>(set);
        return list;
    }
}
