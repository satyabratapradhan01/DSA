
import java.util.*;

public class ArrayListt {
    public static void main(String[] args) {
        ArrayList<Integer> aList = new ArrayList<>();
        aList.add(10);
        aList.add(20);
        aList.add(30);
        aList.add(40);
        System.out.println(aList);
        aList.add(1, 17);
        // System.out.println(aList.remove(2));
        System.out.println(aList);
    }
}
