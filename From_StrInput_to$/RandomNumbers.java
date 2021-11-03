
// In this class we are going to generate some random numbers using the methods of
// the Random class
import java.util.Random; // import the Random class from the package java.util
public class RandomNumbers {
    public static void main (String args[]){
        Random generator = new Random (); // create a new object of the class Random
        int num1;
        double num2;
        
        num1 = generator.nextInt(); // nextInt is a method in Random class
        System.out.println("A random integer: "+ num1);
        num1 = generator.nextInt(10);
        System.out.println("From 0 to 9: "+ num1);
        num1 = generator.nextInt(10) + 1;
        System.out.println("From 1 to 10: "+ num1);
        num1 = generator.nextInt(15) + 20;
        System.out.println("From 20 to 34: "+ num1);
        num1 = generator.nextInt(20) - 10;
        System.out.println("From -10 to 9: "+ num1);
        
        num2 = generator.nextDouble(); 
        System.out.println("a random decimal number between 0 and 1: "+ num2);
        
        num2 = generator.nextDouble() * 6; // 0.0 to 5.99999
        num1 = (int) num2 + 1;
        System.out.println("From 1 to 6: "+ num1);
        
    }
}
