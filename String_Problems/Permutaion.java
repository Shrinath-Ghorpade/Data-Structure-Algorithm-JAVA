package String_Problems;

public class Permutaion {
    // public static void main(String[] args) {
    //     permutation(" ", "abc");
    // }

    // static void permutation(String p, String up){

    //     if(up.isEmpty()){
    //         System.out.println(p);
    //         return;
    //     }
        
    //     char ch=up.charAt(0);

    //     for(int i=0; i<p.length(); i++){
    //         String f=p.substring(0, i);
    //         String s=p.substring(i, p.length());
    //         permutation(f+ch+s, up.substring(1));

    //     }
    // }

    public static void main(String[] args) {
        String str = "ABC";
        permute(str, 0, str.length()-1);
      
    }

    // private static void permute(String str, int l, int r) {
    //     if (l == r) {
    //         System.out.println(str);
    //     } else {
    //         for (int i = l; i <= r; i++) {
    //             str = swap(str, l, i);
    //             permute(str, l + 1, r);
    //             str = swap(str, l, i); // backtrack
    //         }
    //     }
    // }
    static void permute(String str,int l, int r){
        if(l==r){
            System.out.println(str);
        }
        else{
            for(int i=l;i<=r;i++){
                str=swap(str, l, i);
                permute(str, l+1, r);
                str=swap(str,l, i);
            }
        }
    }

    // public static String swap(String a, int i, int j) {
    //     char temp;
    //     char[] charArray = a.toCharArray();
    //     temp = charArray[i];
    //     charArray[i] = charArray[j];
    //     charArray[j] = temp;
    //     return String.valueOf(charArray);
    // }
    public static String swap (String str, int i, int j){
        char[] charArray=str.toCharArray();

        char temp=charArray[i];
        charArray[i]=charArray[j];
        charArray[j]=temp;

        return String.valueOf(charArray);
    }
}
