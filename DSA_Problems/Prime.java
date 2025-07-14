public class Prime {
    public static void main(String[] args) {
         int num=30;

         System.out.println("PRime no upto "+num);

         for(int i=2;i<num;i++){
            if(isPrime(i)){

                System.out.print(i+" ");
            }
         }
    }
    static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2; i<num;i++){

            if(num%i==0){
                return false;
            }

        }
        return true;
    }
}
