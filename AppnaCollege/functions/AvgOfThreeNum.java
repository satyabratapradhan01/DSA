package functions;

public class AvgOfThreeNum {
    public static int avg(int a, int b, int c) {
        int avrege = (a+b+c)/3;
        return avrege;
    }
    public static void main(String[] args) {
        int avg = avg(10, 10, 10);
        System.out.println(avg);
    }
}
