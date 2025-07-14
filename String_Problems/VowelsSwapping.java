package StringQues;
import java.util.*;
public class VowelsSwapping {
    public static void main(String[] args) {
        String str="IceCreAm";
        System.out.println(vowelSwap(str));


    }

    public static String vowelSwap(String str){
        Set<Character> vowels=new HashSet<>();
        vowels.add('a');vowels.add('A');
        vowels.add('e');vowels.add('E');
        vowels.add('i');vowels.add('I');
        vowels.add('o');vowels.add('O');
        vowels.add('u');vowels.add('U');

        char[] chars=str.toCharArray();
        int left=0;
        int right=chars.length-1;

        while (left<right) {
            while (left<right&& !vowels.contains(chars[left])) {
                left++;
            }
            while ((left<right&&!vowels.contains(chars[right]))) {
                right--;
            }

            char temp=chars[left];
            chars[left]=chars[right];
            chars[right]=temp;

            left++;
            right--;
        }

        return new String(chars);
        
    }
}
