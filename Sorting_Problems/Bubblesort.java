import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        int [] nums={5,4,3,2,1};
        bubblesort(nums);
        System.out.println(Arrays.toString(nums));

        printarray(nums);

    }

     static void  bubblesort(int arr[]){

         for(int i=0; i<arr.length; i++){

            for(int j=1; j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){

                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
         }
    }

    static void printarray(int [] arr){

        for(int value: arr){
            System.out.print(value + " ");
        }
    }
}
