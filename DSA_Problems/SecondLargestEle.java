public class SecondLargestEle {
    public static void main(String[] args) {
        int [] arr={8,5,3,8,1};
        System.out.println( secondL(arr));
    }

    static int secondL(int[] arr){
        int largest=Integer.MIN_VALUE;;
        int secondLargest=Integer.MIN_VALUE;;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>secondLargest&&arr[i]<largest){
                secondLargest=arr[i];
            }
        }
      
        return secondLargest;

    }
}
