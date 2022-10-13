/**
 * Name: Luke Martin
 * Class: Itec 2150
 * Description: The task was to create array values for the first 50 numbers
 * input by the user and to catch the user inputting numbers outside the fixed
 * Array set and re-running the program until the user inputs the correct number
 * in the Array set and stopping the program when a letter is input by the user.
 * Grade:
 */

//import user inputs with scanner and stopping the program with import InputMismatchException
package Exercise4;
import java.util.Scanner;
import java.util.InputMismatchException;

public class RandomArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] numbers = new double[50];

        //creating for loop to randomly print Array numbers from user input
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = Math.random();
        }
        //boolean repeats ArrayOutOfBoundsException when number is wrong
        boolean valid = true;
        {
            //do while loop with two catches in the try 
            do {
                try {
                    System.out.println("Enter a integer between 0-49.");
                    int num = sc.nextInt();
                    System.out.println("Array value of your number, " + num + ", is " + numbers[num]);

                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Your number was not in the array.");
                } catch (InputMismatchException e) {
                    System.out.println("There was not a number input.");
                    //include valid=false here because it would repeat InputMismatchException
                    //for infinity
                    valid = false;
                }

            }while(valid);
        }
    }
}
