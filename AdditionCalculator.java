/**
 * Name: Luke Martin
 * Class: Itec 2150
 * Description: The objective of this assignment is to create a simple user
 * input addition class between two different numbers and to use a try and catch
 * with an exception handling case to disregard wrong inputs by the user, but to
 * also continue to run the code after a wrong input.
 * Grade:
 */

//import Scanner for user input
package Exercise4;
import java.util.*;

public class AdditionCalculator {

    //created an add() class to include the try and catch
    public static void add(){
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        //tries the user input of both a and b
        try{
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println(a+b);
            //catching the exception and telling the user to try again
            //including add() makes the code repeat instead of stopping
        }catch(Exception e){
            System.out.println("That is not a number. Try again: ");
            add();
        }
    }
//main method only needs System.out.print to print starting sentence and the add() method
    public static void main(String[] args) {
        System.out.println("Enter two integers: ");
        add();
    }
}
