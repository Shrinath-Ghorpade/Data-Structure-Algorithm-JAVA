

public class QuickSort {
    public static void main(String[] args) {

        int [] nums={5,4,3,2,1};

        quickSort(nums, 0, nums.length-1);
        printArray(nums);
        
    }

    static void quickSort(int[] arr, int low, int high){

        if(low>=high){
            return;
        }

        int s=low;
        int e=high;
        int mid=s+(e-s)/2;
        int pivot=arr[mid];

        while (s<=e) {
            
            while (arr[s]<pivot) {
                s++;
            }
            while (arr[e]>pivot) {
                e--;
            }

            if(s<=e){
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }

        }

        quickSort(arr, low, e);
        quickSort(arr, s, high);

    }

    static void printArray(int [] arr){
        for(int value: arr){
            System.out.print(value+" ");
        }
    }
}
