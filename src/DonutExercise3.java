import java.util.Scanner;

/**
 * DonutExercise3.java
 * @author :   Andrew Dichabeng
 * @since :   12/26/2016
 */

public class DonutExercise3 {

    public static final int NUMBER_OF_RUNS = 10;    // the number of runs required

    /**
     * Method to compute the average of an array of integers.
     * @param kfc   -   The integer array to be averaged.
     * @return  -   Returns the average of the integer array.
     */
    private static double average(int kfc[]) {
        double sum = 0;
        for (int i = 0; i < kfc.length; i++) {
            sum += kfc[i];
        }
        return sum/kfc.length;
    }

    /* main method */
    public static void main(String []args) {

        Scanner scanner = new Scanner(System.in);   // scanner for keyboard I/O
        int num1, num2, num3;                       // temp variables to hold integers
        int tempArray[] = new int[3];               // a temporary array to hold integer values

        for (int i = 0; i < NUMBER_OF_RUNS; i++) {

            // user prompt
            System.out.println("Enter 3 integers and press the enter key after each integer : ");

            // reading integers from keyboard
            num1 = scanner.nextInt();
            num2 = scanner.nextInt();
            num3 = scanner.nextInt();

            // creating array to be passed to method
            tempArray[0] = num1;
            tempArray[1] = num2;
            tempArray[2] = num3;

            // output
            System.out.printf("Run # %d\n", i + 1);
            System.out.printf("The average of [%d, %d, %d] = %.2f\n", num1, num2, num3, average(tempArray));

            // close the scanner resource
            scanner.close();
        }
    }
}
