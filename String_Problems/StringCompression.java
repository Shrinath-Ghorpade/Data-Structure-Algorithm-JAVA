package String_Problems;

public class StringCompression {
    public static void main(String[] args) {
        
    }

    public int compare(char[] chars){
        int write=0;
        int i=0;
        while(i<chars.length){
            char currentChar=chars[i];
            int count=0;

            while(i<chars.length && chars[i]==currentChar){
                i++;
                count++;
            }

            chars[write++]=currentChar;

            if(count>1){
                for(char c:Integer.toString(count).toCharArray()){
                    chars[write++]=c;
                }
            }
        }
        return write;
    }
}
