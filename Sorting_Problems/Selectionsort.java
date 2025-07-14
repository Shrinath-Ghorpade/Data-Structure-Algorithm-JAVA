import java.util.Arrays;

public class Selectionsort {
    public static void main(String[] args) {
        int[] nums={5,4,3,2,1};

        // selection(nums);
        // printarray(nums);
        recurseSelection(nums);
        System.out.println(Arrays.toString(nums));
        
    }

    // static void selection(int [] arr){
    //     for(int i=0;i<arr.length-1;i++){

    //         int min=i;

    //         for(int j=i+1;j<arr.length;j++){
    //             if(arr[j]<arr[min]){
    //                 min=j;
    //             }

    //         }

    //         int temp=arr[min];
    //         arr[min]=arr[i];
    //         arr[i]=temp;
    //     }

    // }

    // static void printarray(int[] arr){
    //     for(int value: arr){
    //         System.out.print(value +" ");
    //     }
    // }

    static void recurseSelection(int[] arr){
        for(int i=0;i<arr.length;i++){

            int last=arr.length-i-1;//if n-1 =4 so we need last second elem so n-i-1

            int maxElement=maxIndex(arr, 0, last);

            int temp=arr[maxElement];
            arr[maxElement]=arr[last];
            arr[last]=temp;
        }
    }

    static int maxIndex(int[] arr, int start, int end){
        int max=start;

        for(int i=0;i<=end;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }

        return max;
    }

//     static void selection(int[] arr){
//         for(int i=0; i<arr.length-1; i++){

//             int min_index=i;

//             for(int j=i+1; j<arr.length; j++){

//                 if(arr[j]<arr[min_index]){
//                     min_index=j;
//                 }

//                 int temp=arr[i];
//                 arr[i]=arr[min_index];
//                 arr[min_index]=temp;
//             }
//         }
//     }

//     static void printarray(int[] arr){
//         for(int value: arr){
//             System.out.print(value + " ");
//         }
//     }
}
