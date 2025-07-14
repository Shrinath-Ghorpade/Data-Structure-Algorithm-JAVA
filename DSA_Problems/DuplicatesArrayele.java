public class DuplicatesArrayele {
    public static void main(String[] args) {
        int[] arr={20,20,3,5,9,3,55,6,5};

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[j]);
                }
            }
        }
    }
}
