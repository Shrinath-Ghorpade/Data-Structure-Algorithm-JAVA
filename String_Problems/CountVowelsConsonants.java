package String_Problems;

public class CountVowelsConsonants {
    
    public static void main(String[] args) {
        
        String str="Hello world";

        int vowels=0;
        int consonants=0;

        for(int i=0; i<str.length();i++){
            char ch=Character.toLowerCase(str.charAt(i));

            if(ch=='a'||ch=='e'||ch=='o'||ch=='i'||ch=='u'){
                ++vowels;
            }
            else if(ch>='a'&& ch<='z'){
                ++consonants;
            }
        }
        System.out.println("Vowels:"+vowels);
        System.out.println("Consonants:"+consonants);
    }
}
