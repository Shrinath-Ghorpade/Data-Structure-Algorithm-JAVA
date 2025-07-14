import java.util.Arrays;

public class Remove0 {
    public static void main(String[] args) {
        int[] arr={4,0,1,0,2,3};
        int j=0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }

        System.out.println(Arrays.toString(arr));

    }

}   
