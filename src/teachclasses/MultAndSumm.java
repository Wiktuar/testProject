package teachclasses;

public class MultAndSumm {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(triangle(5));
    }

    static int factorial(int n){
        if (n == 1) return 1;
        return n * factorial(n-1);
    }

    static int triangle(int n) {
        if (n == 1) return 1;
        return n + triangle(n - 1);
    }
}
