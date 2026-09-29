public class Calculator {

    // add() with 2 integers
    int add(int a, int b) {
        return a + b;
    }

    // add() with 3 integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // add() with 2 double values
    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

        // Create Calculator object
        Calculator calc = new Calculator();

        // Calling add(int, int)
        int result1 = calc.add(10, 20);

        // Calling add(int, int, int)
        int result2 = calc.add(10, 20, 30);

        // Calling add(double, double)
        double result3 = calc.add(10.5, 20.5);

        // Display results
        System.out.println("Addition of 2 integers = " + result1);
        System.out.println("Addition of 3 integers = " + result2);
        System.out.println("Addition of 2 doubles = " + result3);
    }
}