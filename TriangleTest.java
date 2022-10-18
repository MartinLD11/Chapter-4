/**
 * Name: Luke Martin
 * Class: Itec 2150
 * Description: We are creating a triangle by inputting three numbers and having them equal true and
 * if not the program will spit out an input sentence. Making a checkSides boolean class to run the
 * parameters for the program and throwing the illegal argument exception when the user does not input
 * the proper data for a triangle
 * Grade:
 */

package Exercise4;
import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        //scanner for user input
        Scanner sc = new Scanner(System.in);

        //try catch to instruct user to input three numbers and throw the exception
            try {
                System.out.println("Enter three numbers that make a triangle: ");
                Triangle t = new Triangle(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
                System.out.println(t.checkSides());

            } catch (Exception e) {
                System.out.println("Exception: " + e);
        }
    }
