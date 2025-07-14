package CollectionFRamworks;

import java.util.PriorityQueue;

public class Priorityqueue {
    public static void main(String[] args) {
        
        PriorityQueue<Integer> pq =new PriorityQueue<>((a,b)->b-a);

        pq.add(10);
        pq.add(20);
        pq.add(50);
        pq.add(30);

        System.out.println(pq.peek());
        // System.out.println(pq.poll());
        System.out.println(pq);
    }
}
