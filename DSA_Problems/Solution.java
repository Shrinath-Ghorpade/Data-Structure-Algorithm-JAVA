// class Solution {

//     public static void main(String[] args) {
//         reverse(args);
//     }
//     public static void reverseString(char[] s) {
//         String[] rev={"h","e","l","l","o"};
//         reverse(rev);
//         System.out.println(rev);
//     }
    
//     static void reverse(String[] s){
        
//         int left=0;
//         int right=s.length-1;
        
//         while(left<right){
//             String temp=s[left];
//             s[left]=s[right];
//             s[right]=temp;
//         }
        
//         left++;
//         right++;
//     }
// }
class Solution {
    public String reverseWords(String s) {
        s = s.trim();
 
        String[] words=s.split("\\s+");
 
        StringBuilder rev=new StringBuilder();
 
        for(int i=words.length-1; i>=0; i--){
                 rev.append(words[i]);
                 if(i!=0){
                   rev.append(" ");
                 }
        }
 
        return rev.toString();

        // char[] charArr=s.toCharArray();
        //         int left=0;
        //         int right=charArr.length-1;
                
        //         while(left<right){
        //             char temp=charArr[left];
        //             charArr[left]=charArr[right];
        //             charArr[right]=temp;
        //         }
                
        //         left++;
        //         right--;

        //         return charArr.toString();

     }
 

    public static void main(String[] args) {
        Solution solution = new Solution();
        String input = "A man, a plan, a canal: Panama";
        String result = solution.reverseWords(input);
        System.out.println(result);  // Output: "Panama canal: a plan, a man, A"
    }
}
