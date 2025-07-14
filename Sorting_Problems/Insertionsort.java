public class Insertionsort {
    public static void main(String[] args) {
        
        int[] nums={5,3,4,1,2};
        insertionsort(nums);
        printArray(nums);
    }

    static void insertionsort(int[] arr){

        for(int i=0; i<arr.length-1; i++){

            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){

                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                else{
                    break;
                }
            }
        }
    }

    static void printArray(int[] arr){
        for(int value: arr){
            System.out.print(value+ " ");
        }
    }
}
