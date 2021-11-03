public class Calculator {
    public static void main (String args[]){
        // whats a variable in Java?
        // a variable in Java represents memory space which stores some value
        // name of a variable in Java should start with a lower case letter
        int num1; // declaration of the variable num1 of type integer
        num1 = 5; // initialization of the variable num1 with a value of 5
        int num2 = 3; // declaration & intialization together in one step
        
        int add = num1 + num2;
        int sub = num1 - num2;
        int mult = num1 * num2;
        double div = (double)num1 / (double)num2; // double type reperesents decimal numbers
        int rem = num1 % num2; // gives you remainder
        
        System.out.println("The addition of the two numbers is "+add);
        System.out.println("The difference of the two numbers is "+sub);
        System.out.println("The product of the two numbers is "+mult);
        System.out.println("The division of the two numbers is "+div);
        System.out.println("The remainder of the two numbers is "+rem);
        
        // double/int ok
        // int / double ok
        // double/double ok
        // int/int - remove the decimal part
    }
}