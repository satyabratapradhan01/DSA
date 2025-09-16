package JavaCollectionsFramework;

import java.util.LinkedList;

public class LinkListt {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        System.out.println(ll);
        System.out.println(ll.contains(40));
    }
}
