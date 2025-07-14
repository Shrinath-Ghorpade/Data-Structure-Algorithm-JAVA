package String_Problems;

public class Sstring {
    public static void main(String[] args) {
        String s1="JOyboy";
        System.out.println(s1.length());
        System.out.println(s1.indexOf('o'));
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.charAt(0));
        

        String rev="";

        for(int i=0;i<s1.length();i++){
            rev=s1.charAt(i)+rev;
        }
        System.out.println(rev);

        System.out.println(s1.equals(rev));
    }
    
}
