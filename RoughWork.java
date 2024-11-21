public class RoughWork {
    // Recursive method to multiply two numbers
    public static int multiply(int a, int b) {
        // If b is less than 0, make it positive and adjust the result accordingly
        if (b < 0) {
            return multiply(a, -b);
        }
        // Base case: if b is 0, the result is 0
        else if (b == 0) {
            return 0;
        }
        // Recursive case: add a to b the result of multiply(a, b-1)
        else {
            return a + multiply(a, b - 1);
        }
    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 3;
        int result = multiply(num1, num2);
        System.out.println("The product of " + num1 + " and " + num2 + " is " + result);
    }
}

