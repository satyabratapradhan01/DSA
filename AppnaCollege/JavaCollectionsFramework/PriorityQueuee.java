package JavaCollectionsFramework;

import java.util.PriorityQueue;

public class PriorityQueuee {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(1);
        pq.offer(4);
        pq.offer(6);
        pq.offer(3);
        pq.offer(2);
        pq.offer(5);
        System.out.println(pq);
        while (pq.isEmpty() == false) { 
            System.out.println(pq.peek());
            pq.poll();
        }
        // System.out.println(pq.peek());
        // pq.poll();
        // System.out.println(pq.peek());
        // pq.poll();
        // System.out.println(pq.peek());
        // pq.poll();
        // System.out.println(pq.peek());
    }
}
