/**
 *  Code for the factorial program
 *  Using recursion in java.
 */
package TypesOfRecursion;

public class factorial {
    public static void main(String[] args) {

        System.out.println(Factorial(5)); // function called in main method
        System.out.println(Factorial(4));
    }

    public static int Factorial(int n) throws IllegalArgumentException {
        if (n < 0)
            throw new IllegalArgumentException();  // this line states that argument cannot be negative
        else if (n == 0)                   // this line states the factorial of 0 is 1
            return 1;
        else
            return n * Factorial(n - 1); // for positive integer this recursive code runs.
    }
}