package functions;

public class BinomialCoefficient {
    public static int factorial(int n){
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact *= i;
        }
        return fact;
    }

public static int binmalCoficiet(int n, int r){
    int fact_n = factorial(n);
    int fact_r = factorial(r);
    int fact_nmr = factorial(n - r);
    int bc = fact_n/(fact_r*fact_nmr);
    return bc;
}
    public static void main(String[] args) {
       int c = binmalCoficiet(5, 2);
       System.out.println(c);
    }
}
