public class EvenOdd {
    public static void main(String[] args) {
        
        int[] arr={2,3,4,5,6,7};

        int[] arr2={3,2,5,4,1};
        int even=0;
        int odd=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even++;
                System.out.println(arr[i]);
            }
            else{
                odd++;
            }
        }
        System.out.println(even);
        System.out.println(odd);


        
        for(int i=0; i<arr.length; i++){
            for(int j=0;j<arr2.length;j++){

                if(arr[i]==arr2[j]){
                    System.out.println("commoan elements" +arr[i]);
                }
            }
        }
        
    }
}
