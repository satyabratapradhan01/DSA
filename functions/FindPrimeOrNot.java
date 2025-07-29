package functions;

public class FindPrimeOrNot {
    public static boolean  checkPrimeNumber(int n){
        boolean NumType = true;
        for(int i = 2; i<=Math.sqrt(n); i++){
            if (n%i == 0) {
                NumType = false;
            }
        }
         return NumType;
    }

    public static void PrimeInRange(int n){
       for(int i=2; i<n; i++){
         if (checkPrimeNumber(i)) {
                System.out.print(i + " ");

            }
       }
    }
    public static void main(String[] args) {
        PrimeInRange(20);
    }
}
