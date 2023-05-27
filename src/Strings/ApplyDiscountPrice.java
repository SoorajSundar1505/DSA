package Strings;

import java.util.ArrayList;
import java.util.List;

public class ApplyDiscountPrice {
    public static void main(String[] args) {
        String sentence = "$1 and $2 which is $3$";
        int discount = 50;
        System.out.println(discountPrices(sentence,discount));
    }
    public static String discountPrices(String sentence, int discount) {
        List<Integer> index = new ArrayList<>();
        String[] split = sentence.split("$");
        System.out.println(split[0]);
        for(int i=0;i<sentence.length()-1;i++){
            if(sentence.charAt(i)=='$'){
                double per = discount/100;
                int price = (int)sentence.charAt(i+1);
                double replace = per*price;
//                String add = Double.toString(replace);
                sentence.replace(sentence.charAt(i+1),(char)(replace));
            }
        }

        return sentence;
    }
}
