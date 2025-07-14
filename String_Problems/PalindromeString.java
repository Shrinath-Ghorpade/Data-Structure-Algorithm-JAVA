package String_Problems;
public class PalindromeString {
    public static void main(String[] args) {
        // String str="A man, a plan, a canal: Panama";
        // System.out.println(palindrome(str));

        String str2="madam";

        String reverse=new StringBuilder(str2).reverse().toString();

        if(reverse.equals(str2)){
            System.out.println("Palindrome");
        }else{
            System.out.println("not");
        }

    }

    // static boolean palindrome(String str){
    //     str=str.toLowerCase();

    //     int left=0;
    //     int right=str.length()-1;

    //     while (left<right) {

    //         while (left<right && !Character.isLetterOrDigit(str.charAt(left))) {
    //             left++;
    //         }
    //         while (left<right && !Character.isLetterOrDigit(str.charAt(right))) {
    //             right--;
    //         }

    //         if(str.charAt(left)!=str.charAt(right)){
    //             return false;
    //         }

    //         left++;
    //         right--;
            
    //     }
    //     return true;
    // }

    static boolean palindrome(String s){
        s=s.toLowerCase();
        int left=0;
        int right=s.length()-1;

        while (left<right) {
            
            while (left<right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left<right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            if(s.charAt(left)!= s.charAt(right)){
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
