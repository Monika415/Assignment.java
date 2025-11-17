import java.util.*;

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public double add(double a, double b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class CalculatorDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        System.out.println("Two int sum: " + calc.add(10, 20));
        System.out.println("Two double sum: " + calc.add(10.5, 20.3));
        System.out.println("Three int sum: " + calc.add(10, 20, 30));
    }
}
