// in this class we are going to use some of the methods of the Math class
// why are we not creating the object of the Math class to use its methods here?
// answer is because all methods of the Math class are declared as 'static'. When in java
// a method is declared as 'static', then we dont need to create object of that class to 
// use that method...instead we can simply use the class name to call that method
// like Math.pow, Math.sqrt
import java.util.Scanner;
import java.lang.Math;
public class SquareAndSquareRoot {
    public static void main (String args[]){
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a number");
        double num = scan.nextDouble();
        
        double square = Math.pow(num, 2);
        double sqRoot = Math.sqrt(num);
        
        System.out.println("The square of the number is "+square);
        System.out.println("The square root of the number is "+ sqRoot);
    }
}