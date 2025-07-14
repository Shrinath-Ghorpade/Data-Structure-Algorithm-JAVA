public class Armstron {
    public static void main(String[] args) {
        int num=153;    
        // System.out.println(countDigit(num));

        if(isarmStrong(num)){
            System.out.println("TRUe");

        }
        else System.out.println("Not");
    }


    static int countDigit(int num){
        int count=0;
        while(num!=0){
             num/=10;
             count++;   
        }
        return count;
    }

    static boolean isarmStrong(int n){
        int original=n;
        int noOfdigits=countDigit(n);
        int sum=0;
        while (n!=0) {
            int digit =n%10;
            sum+=Math.pow(digit, noOfdigits);
            n/=10;

        }

        return sum==original;
    }
}
