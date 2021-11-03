// this class will accept two integers from the user and perform 5 operations on them
import java.util.Scanner; // import the Scanner class to your class so we can use it
public class CalculatorUserInput {
    public static void main (String args[]){
        Scanner scan = new Scanner (System.in); // create object of the Scanner class
        System.out.println("Enter the first number");
        int num1 = scan.nextInt();// use the nextInt() method of the Scanner class to accept
        // the integer from the user
        System.out.println("Enter the second number");
        int num2 = scan.nextInt();
        
        int add = num1 + num2;
        int diff = num1 - num2;
        int mult = num1 * num2;
        double div = (double)num1 / num2;
        int rem = num1 % num2;
        
        System.out.println(add);
        System.out.println(diff);
        System.out.println(mult);
        System.out.println(div);
        System.out.println(rem);
        
        // you create an object by following how a constructor is defined in the class which
        // you are creating the object for
        // whats a constructor? constrcutor is a type of a method in a class which gets 
        // invoked/called/summoned when you create object of that class in another class
    }
}