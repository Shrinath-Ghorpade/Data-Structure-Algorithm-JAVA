package String_Problems;

public class Lcs {
    public static void main(String[] args) {
        String s1 = "AGGTAB";
        //Longest common subsequence
        String s2 = "GXTXAYB";

        int result=lcs(s1, s2, s1.length(), s2.length());
        System.out.println(result);

       
    }

    static int lcs(String s1, String s2,int m, int n){

        if(m==0|| n==0){ return 0;}

        if(s1.charAt(m-1)==s2.charAt(n-1)){
            return 1+lcs(s1, s2, m-1, n-1);
        }
        else{
            return Math.max(lcs(s1, s2, m, n-1), lcs(s1, s2, m-1, n));
        }
    }
}