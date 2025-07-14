public class Linearsearch {
    public static void main(String[] args) {
        int [] nums={9,8,5,6,9};
        int key=5;
        int result=linearsearch(nums, key);
        System.out.println(result);
        System.out.println(search(nums, key));
        System.out.println("minimum no" +min(nums));
        
    }

    static int min(int[] arr){
        int ans=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<ans){
                ans=arr[i];
            }
        }
        return ans;
    }
    static int linearsearch(int[]arr,int target){

        for(int i=0;i<arr.length;i++){
            if(target==arr[i]){
                return i;
            }
        }
        return -1;
    }

    static int search(int[] arr,int target){
        for (int i : arr) {
            if(i==target){
                return i;
            }
        }
        return -1;
    }
}


