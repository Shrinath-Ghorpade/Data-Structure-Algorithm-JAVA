package StringQues;

public class Reversestring {
    
//     public static void main(String[] args) {
        
//     String str="Race a car";
//     String rev="";

//     for(int i=0;i<str.length();i++){
//         rev=str.charAt(i)+rev;

//     }
//     System.out.println(rev);
//     if(str.equals(rev)){

//         System.out.println("Palindrome");
//     }
//     else{System.out.println("Not");}

//     String count="one two three four";
// // split function spilts the string into array of substring with '\\s' reg expression is used to calculate whitespace 
//     int word_counter=count.split("\\s").length;

//     System.out.println(word_counter);
// }
// }


// public static void reverseString(char[] s) {
//     int left = 0;
//     int right = s.length - 1;
    
//     while (left < right) {
//         // Swap characters at left and right indices
//         char temp = s[left];
//         s[left] = s[right];
//         s[right] = temp;
        
//         // Move pointers towards the center
//         left++;
//         right--;
//     }
// }

public static String reverseString(String s) {
    // Convert the string to a char array
    char[] charArray = s.toCharArray();
    
    int left = 0;
    int right = charArray.length - 1;
    
    while (left < right) {
        // Swap characters at left and right indices
        char temp = charArray[left];
        charArray[left] = charArray[right];
        charArray[right] = temp;
        
        // Move pointers towards the center
        left++;
        right--;
    }
    
    // Convert the char array back to a string and return it
    return new String(charArray);
}


public static void main(String[] args) {
    // char[] s = {'h', 'e', 'l', 'l', 'o'};
    // reverseString("Helllo");
   System.out.println( reverseString("Helllo"));
         // Output should be ['o', 'l', 'l', 'e', 'h']
}}