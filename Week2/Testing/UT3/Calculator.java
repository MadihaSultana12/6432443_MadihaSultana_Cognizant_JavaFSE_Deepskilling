package Testing;

public class Calculator {

    // Addition method
    public int add(int a, int b) {
        return a + b;
    }

    // Subtraction method
    public int subtract(int a, int b) {
        return a - b;
    }

    // Multiplication method
    public int multiply(int a, int b) {
        return a * b;
    }

    // Division method with zero check
    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }

    // Main method for manual testing
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Addition: " + calc.add(2, 3));          // 5
        System.out.println("Subtraction: " + calc.subtract(5, 2));  // 3
        System.out.println("Multiplication: " + calc.multiply(3, 4)); // 12
        System.out.println("Division: " + calc.divide(10, 2));      // 5
    }
}
