public class Factorial {

    static int factorial(int n){

        if(n==0){
            return 1;
        }
        else{
            return (n*factorial(n-1));
        }
    }
    public static void main(String[] args) {
       
       int number=5;

       int res=factorial(number);
       System.out.println(res);
        int fact=1;
        int no=5;

        for(int i=1;i<=no;i++){
            fact*=i;
        }

        System.out.println(fact);
    }
}
