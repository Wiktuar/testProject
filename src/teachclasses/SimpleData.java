package teachclasses;

import java.util.ArrayList;
import java.util.List;

public class SimpleData {
    public static void main(String[] args) {
        System.out.println(getprimes(1000));
    }

//  метод перебирает все числа до 1000 и при помощи метода isprime() ищет простые числа
    private static List<Integer> getprimes(int data){
        ArrayList<Integer> primes = new ArrayList<>();
        primes.add(2);
        for(int i = 3; i < data; i +=2){
            if(isPrime(i, primes)){
                primes.add(i);
            }
        }
        return primes;
    }

//  метод, определяющий, является ли число простым
    private static boolean isPrime(int number, List<Integer> primes){
        double sqrt = Math.sqrt(number);
        for(int n : primes){
            if(n > sqrt) return true;
            if(number % n == 0) return false;
        }
        return true;
    }
}
