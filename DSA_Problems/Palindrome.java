public class Palindrome {

    static int sum =0;

    static int reverse(int n){
        if(n==0){
            return sum;
        }

        int rem=n%10;
        sum=sum*10+rem;

         return reverse(n/10);
    }

    static boolean palin(int n){
       int reversed=reverse(n);
        return n== reversed;    
    }
    public static void main(String[] args) {
        
        int[] n={9,8,7,6,5,4,3,2,1,0};

       
        int sum=0;
        for(int i=0;i<n.length;i++){
            sum=sum*10+n[i];
        }

        System.out.println(sum+1);

        System.out.println( palin(12321));
    }

}
