
public class TwoSum {
   public static int[] twoSum(int[] arr, int target){
   
    for(int i=0;i<arr.length-1;i++){
        for(int j=0;j<arr.length;j++){
            if(arr[i]+arr[j]==target){
                return new int[]{i,j};
            }
        }
    }
   
    return new int[] {};
   }
    public static void main(String[] args) {
        int[] arr={5,6,4,3,2};
        int[] result = twoSum(arr, 8);
        
        if (result.length > 0) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No two sum solution found.");
        }
        
    }
}
