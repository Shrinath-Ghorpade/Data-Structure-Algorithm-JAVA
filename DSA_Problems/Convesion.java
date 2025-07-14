public class Convesion {
    public static void main(String[] args) {
        int num=100;
        String str="123";
        String binary=Integer.toBinaryString(num);
        System.out.println(binary);

        System.out.println(Integer.parseInt(binary,2));
        System.out.println(Integer.toHexString(num));

        System.out.println(Integer.parseInt(str));
        
        int n=0;
        
        for(char c: str.toCharArray()){
            n=n*10+(c-'0');

        }
        System.out.println(n);

    }
}
