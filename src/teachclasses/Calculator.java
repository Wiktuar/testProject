package teachclasses;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите два числа:");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        System.out.println("Введите действие:");
        String action = sc.next();
        sc.close();
        System.out.println(calc(number1, number2, action));
    }

    private static int calc(int num1, int num2, String act){
        switch(act){
            case "+" :  return num1 + num2;
            case "-": return num1 - num2;
            case "*": return num1 * num2;
            case "/": return num1 / num2;
            default: return 0;        }
    }
}
