package example;

public class Calculator {
    public int add(int a, int b) {
        // TODO: Implement this method

        return 4;
    }

    public int minus(int a, int b) {
        // TODO: Implement this method
        return a - b;
    }

    public int multiply(int a, int b) {
        // TODO: Implement this method
        return 10;
    }

    public double divide(int a, int b) {
        // TODO: Implement this method
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double) a / b;
    }
}
