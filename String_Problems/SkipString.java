package StringQues;

public class SkipString {
    public static void main(String[] args) {
       System.out.println(skip( "bappleccdah"));
    }

    // static void skip(String ans, String str ){
    //     if(str.isEmpty()){
    //         System.out.println(ans);
    //         return;
            
    //     }
        
    //     char ch=str.charAt(0);


    //     if(ch=='a'){
    //         skip(ans, str.substring(1) );
    //     }
    //     else{
    //         skip(ans+ch, str.substring(1));
    //     }
    // }

    // static String skip(String str){
    //     if(str.isEmpty()){
    //         return " ";
    //     }

    //     char ch=str.charAt(0);

    //     if(ch=='a'){
    //         return skip(str.substring(1));
    //     }
    //     else{
    //         return ch+skip(str.substring(1));
    //     }
    // }

    static String skip(String str){
        if(str.isEmpty()){
            return"";
        }

        if(str.startsWith("apple")){
            return skip(str.substring(5));
        }
        else{
            return str.charAt(0)+skip(str.substring(1));
        }
    }

}
