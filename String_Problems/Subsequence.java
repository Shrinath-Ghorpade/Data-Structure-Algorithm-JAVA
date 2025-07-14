package String_Problems;

// Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
// A subsequence of a string is a new string that is formed from the original string by deleting some 
// (can be none) of the characters without disturbing the relative positions of the remaining characters. 
// (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

class Subsequence {
   static boolean isSubsequence(String s, String t){

       int spointer=0;
       int tpointer=0;

        while (spointer<s.length()&& tpointer<t.length()) {
            if(s.charAt(spointer) == t.charAt(tpointer)){
                spointer++;
            }
            tpointer++;
        }
        return spointer==s.length();
   }    

public static void main(String[] args) {
    // Subsequence checker = new Subsequence();
    
    // Example 1
    // String s = "abc";
    // String t = "ahbgdc";
    // System.out.println(checker.isSubsequence(s, t));  // Output: true
    
    // // Example 2
    // String s2 = "axc";
    // String t2 = "ahbgdc";
    // System.out.println(checker.isSubsequence(s2, t2));  // Output: false
}
}
// public boolean isSubsequence(String s, String t) {
//     int spointer=0;
//     int tpointer=0;
//     while(spointer<s.length() && tpointer<t.length()){
//         if(s.charAt(spointer)==t.charAt(tpointer)){
//             spointer++;
//         }
//         tpointer++;
//     }
//     return spointer== s.length();
// }