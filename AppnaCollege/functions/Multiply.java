package functions;

public class Multiply {
    public static int mult(int a, int b){
        int product = a * b;
        return product;
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int prod = mult(a, b);
        System.out.println(prod);
    }
}
