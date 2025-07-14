public class Binarysearch {
    public static void main(String[] args) {
        int [] nums={10,8,4,3,2};
        int key=2;
        binary_search(nums, key);
    }

    static void binary_search(int[] arr,int target){
        int low=0,high=arr.length-1;
        int mid;

        // order agnostic binary search
        boolean isasc=arr[low]<arr[high];
        while (low<=high) {

            mid=low+(high-low)/2;

            if(arr[mid]==target){
                System.out.println(mid);
                return;
            }

            if(isasc){
                 if(arr[mid]<target){
                    low=mid+1;
                }
                else{
                   high=mid-1;
                }
            }
            else{
                if(arr[mid]>target){
                    low=mid+1;
                }
                else{
                   high=mid-1;
                }
            }
            
    
        
        }
        System.out.println("Not found in the list");
        }
    
        
        
    }

