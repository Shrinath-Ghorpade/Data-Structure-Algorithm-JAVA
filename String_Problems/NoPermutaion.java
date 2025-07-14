package StringQues;

import java.util.Arrays;

public class NoPermutaion {
    public static void main(String[] args) {
        int[] n={1,2,3};
        permute(n, 0, n.length-1);
    }


    static void permute(int[] n,int l, int r){
        if(l==r) System.out.println(Arrays.toString(n));

        else{
            for(int i=l;i<=r;i++){
                n=swap(n,l,i);
                permute(n, l+1, r);
                n=swap(n, i, i);
            }
        }
    }

    static int[] swap(int[] n,int i, int j){

        int temp=n[i];
        n[i]=n[j];
        n[j]=temp;

        return n;
    }

    
}
