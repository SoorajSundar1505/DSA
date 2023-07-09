import java.util.HashMap;
import java.util.Map;

public class isPalindromePermutation {
    public static void main(String[] args) {
        String s = "deed";
        int len = s.length();
        Map<Character,Integer> map = new HashMap<>();
        char[] arr = s.toCharArray();
        int count = 1;
        for(Character c : arr){
            if(!map.containsKey(c)){
                map.put(c,count);
            }else{
                map.put(c,count+1);
            }
        }
        System.out.println(map);
        int oddCount=0;
        int evenCount=0;
        if(len%2!=0){
            for(Map.Entry<Character,Integer> entry : map.entrySet()){
                if(entry.getValue()%2!=0) oddCount++;
            }
            if(oddCount%2==0) {
                System.out.println("Not Permutation");
            }else{
                System.out.println("Permutation");
            }
        }else if(len%2==0) {
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if (entry.getValue() % 2 != 0) {
                    System.out.println("Not a palindrome");
                    break;
                }
            }

        }


    }

}
