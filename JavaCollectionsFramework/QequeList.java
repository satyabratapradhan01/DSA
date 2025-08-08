package JavaCollectionsFramework;

import java.util.ArrayDeque;

public class QequeList {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        // FIFO
        ad.offer(2);
        ad.offer(3);
        ad.offer(6);
        ad.offer(4);
        ad.offer(7);
        ad.offer(9);
        System.out.println(ad);
        ad.poll();
        System.out.println(ad.peek());
    }
}
