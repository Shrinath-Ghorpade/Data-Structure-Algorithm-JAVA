public class Recursion {
    public static void main(String[] args) {

    // fun(5);
      
    }

    // fibonacci series using recursion
    static int recursion(int n){

        if(n<2){
            return n;
        }
        return recursion(n-1)+recursion(n-2);
    }

    // sum of digits in a number
    static int sum(int n){
        if(n==0){
            return 0;
        }
        return (n%10)+sum(n/10);
    }

    // to print n to 1 numbers
    static void fun(int n){
        if(n==0){
            return;
        }

        System.out.println(n);
        fun(n-1);
        System.out.println();
        System.out.println(n);
    }


    // sum of n to 1 numbers

    static int sum2(int n){
        if(n<=1){
            return 1;
        }

        return n+sum2(n-1);
    }

    // reverse a number
    static int sum=0;
    static void reversen(int n){
        if(n==0){
            return;
        }
        int rem=n%10;

        sum=sum*10+rem;

        reversen(n/10);
        

    }

    
}
