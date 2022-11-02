/**
 * Name: Luke Martin
 * Class: Itec 2150
 * Description: In this exercise we needed to create a splitStack method that would take a group
 * of random numbers that are both positive and negative numbers and putting them in order from
 * smallest to largest as well as separating the positive and negative numbers with negative number list
 * starting the queue and the positive numbers ending the list.
 * Grade: 
 */

package Practice;

//importing a LinkedList to state the values from a list
//and importing Queue and Stack to read the values in the queue and
//produce them in the stack
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SplitStack {

    public Stack<Integer> splitStack(Stack<Integer> stack) {

         //creating new stack to hold split Stack
        Stack<Integer> splitStack = new Stack<>();

        //creating a Queue for Auxiliary storage.
        Queue<Integer> queue = new LinkedList<>();

         //pop each element from stack and check whether it is negative of positive if number is
         //negative push number in splitStack if number is positive add element in a queue
        while (!stack.isEmpty()) {
            int number = stack.pop();

            if (number < 0) {
                splitStack.push(number);
            } else if (number > 0) {
                queue.add(number);
            }
        }
         //removed all elements from queue and push onto the splitStack.
        while (!queue.isEmpty()) {
            splitStack.push(queue.remove());
        }
        return splitStack;
    }

    public static void main(String[] args) {
        //creating object of this class to call splitStack method.
        SplitStack stack = new SplitStack();

        //creating Integer Stack and push some element onto the Stack
        Stack<Integer> list1 = new Stack<>();
        list1.push(-7);
        list1.push(56);
        list1.push(-42);
        list1.push(0);
        list1.push(9);
        list1.push(-45);
        list1.push(67);
        list1.push(67);
        list1.push(-5);
        list1.push(5);

        //calling the splitStack() method by passing the first stack as parameter and print its return value.
        System.out.print("[ 5, -5, 67,-45, 67, 9, 0, -42,56,-7] à output must be like ");
        System.out.println(stack.splitStack(list1).toString());

        //creating another Integer Stack with some elements.
        Stack<Integer> list2 = new Stack<>();
        list2.push(9);
        list2.push(8);
        list2.push(-7);
        list2.push(6);
        list2.push(-5);
        list2.push(4);
        list2.push(-3);
        list2.push(-2);
        list2.push(1);

        //calling the splitStack() method again by passing the second stack as parameter and print its return value.
        System.out.print("[1,-2,-3,4,-5,6,-7,8,9] à output: ");
        System.out.println(stack.splitStack(list2).toString());
    }
}
