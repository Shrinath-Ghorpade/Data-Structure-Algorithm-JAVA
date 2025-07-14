public class Patterns {
    public static void main(String[] args) {
        
            pattern2(4);
    }

    static void pattern1(int n){

        for(int i=1;i<=n;i++){ //firt pass i=1 and j=1 then it prints 1 * then it goes to i then i=2(i++)
                                //then j=1 then it prints 2 * at same line
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    static void pattern2(int n){
        for(int i=1;i<=n;i++){//n-i+1 prints 4,3 ,2 1

            for(int j=1;j<=n-i+1;j++){
                System.out.print("* ");
            }

            System.out.println();
           
        }
    }

    static void pattern3(int n){
        for(int i=1; i<=n; i++){

            for(int j=1; j<=i; j++){
                System.out.print(j );
            }

            System.out.println();
        }
    }
}
