import java.util.Scanner;

/**
 * DonutExercise2.java
 * @author :   Andrew Dichabeng
 * @since :   12/26/2016
 */

public class DonutExercise2 {

    /**
     * Method to compute the average of 3 integer numbers.
     * @param int1  -   The first integer.
     * @param int2  -   The second integer.
     * @param int3  -   The third integer.
     * @return  -   Returns the average of the 3 integer numbers passed in.
     */
    private static double average(int int1, int int2, int int3) {
        double sum = int1 + int2 + int3;
        return sum/3;
    }

    /* main method */
    public static void main(String []args) {

        Scanner scanner = new Scanner(System.in);   // the scanner object

        // user prompt
        System.out.println("Enter 3 integers and press the enter key after each integer : ");

        // read in 3 numbers
        int num1, num2, num3;
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();

        // output
        System.out.printf("Numbers = [%d, %d, %d]\n", num1, num2, num3);
        System.out.printf("Average of numbers = %.2f", average(num1, num2, num3));

        // close the scanner resource
        scanner.close();
    }
}
