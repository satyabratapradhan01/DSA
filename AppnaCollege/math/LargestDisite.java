
class Answer {
    public int checkNum(int num) {
        int largestNum = 0;
        while (num > 0) {
            int disit = num % 10;
            if (disit > largestNum) {
                largestNum = disit;
            }
            num = num / 10;
        }
        return largestNum;
    }
}

public class LargestDisite {

    public static void main(String[] args) {
        int num = 129654;
        Answer ans = new Answer();
        int largestDisite = ans.checkNum(num);
        System.out.println("Largest disit is: " + largestDisite);
    }
}
