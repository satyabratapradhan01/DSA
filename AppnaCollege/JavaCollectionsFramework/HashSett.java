package JavaCollectionsFramework;

import java.util.HashSet;

public class HashSett {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(0);
        hs.add(2);
        hs.add(3);
        hs.add(1);
        System.out.println(hs);
        System.out.println(hs.remove(0));
        for(var num:hs){
            System.out.println(num);
        }
    }
}
