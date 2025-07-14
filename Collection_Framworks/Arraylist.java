package CollectionFRamworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arraylist {
    public static void main(String[] args) {
        arrList();
    }


    static void arrList(){
        ArrayList <Integer> list=new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
    
        list.set(0, 0);
        System.out.println(list);

       System.out.println( list.get(1));

       list.remove(0);
       System.out.println(list);

    //    list.add(0,1);it adds the elemenst at specified index and it extends the list
        list.set(0, 0);//it removes previous value then adds the new value
       System.out.println(list);

       System.out.println(list.size());
        System.out.println(list.isEmpty());
        // list.clear();
        // System.out.println(list);

        List<Integer> subList = list.subList(1, 2);
        System.out.println(subList);

        Object[] arr=list.toArray();
        System.out.println(Arrays.toString(arr)); 
    }
}
